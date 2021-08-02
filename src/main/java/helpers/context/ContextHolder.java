package helpers.context;


import helpers.standconfig.StandConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;
import java.util.Map;

/**
 * Класс для хранения переменных теста
 * Синтаксис %{var_name}%
 */
public class ContextHolder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContextHolder.class);
    private static final ThreadLocal<Map<String, Object>> THREAD = new ThreadLocal();
    private static String stand;



    /**
     * Возвращает название стенда, переданного через аргумент stand
     *
     * @return -   стенд
     */
    public static String getStand() {
        return StandConfig.getInstance().stand();
    }


}