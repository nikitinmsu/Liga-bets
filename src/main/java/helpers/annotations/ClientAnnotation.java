package helpers.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ClientAnnotation {

    String endpoint() default "";

//    String protocol() default DEFAULT_PROTOCOL;
//
//    String prefix() default DEFAULT_PREFIX;
//
//    String domain() default DEFAULT_DOMAIN;

}
