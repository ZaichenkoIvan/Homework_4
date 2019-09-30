package hometask.hometask4.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR})
public @interface Inject {
    Life value() default Life.SINGLETON;
}
enum Life{
    SINGLETON,PROVIDER
}
