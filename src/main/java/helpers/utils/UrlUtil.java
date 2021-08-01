package helpers.utils;

import helpers.context.ContextHolder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


public class UrlUtil {
    public static final String PATTERN_API = "${protocol}://${prefix}.${env}.${domain}/${endpoint}";
    public static final String PATTERN_WEB = "${protocol}://${env}.${domain}/${endpoint}";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_PREFIX = "api";
    public static final String DEFAULT_DOMAIN = "ya.ru";

    /**
     * форматирование url
     *
     * @param path   url
     * @param prefix prefix
     * @return отформатированная url
     */
    public static String formatUrl(String pattern, String path, String prefix, String domain) {
    //TODO        path = replaceVarsIfPresent(path);

        if (!path.startsWith("http")) {
            if (path.startsWith("/")) {
                path = path.replaceFirst("/", "");
            }
            path = pattern.replace("${endpoint}", path);
            path = path.replace("${protocol}", DEFAULT_PROTOCOL);
            if (domain != null && !domain.isEmpty()) {
                path = path.replace("${domain}", domain);
            } else {
                path = path.replace("${domain}", DEFAULT_DOMAIN);
            }
            if (prefix != null && !prefix.isEmpty()) {
                path = path.replace("${prefix}", prefix);
            } else {
                path = path.replace("${prefix}", DEFAULT_PREFIX);
            }
            path = path.replace("${env}", ContextHolder.getStand());
        }

        return path;
    }

    /**
     * Кодирует URL или параметры запроса для передачи запрещенных символов, например пробела в URL
     * @return возвращает закодированную строку
     */
    public static String encode(String text) {
        try {
        //TODO    return URLEncoder.encode(replaceVarsIfPresent(text), StandardCharsets.UTF_8.name());
            return URLEncoder.encode(text, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
