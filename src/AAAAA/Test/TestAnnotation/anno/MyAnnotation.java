package AAAAA.Test.TestAnnotation.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/23 - 23:30
 * @Description:
 * @version: 1.0
 */
@Retention(RetentionPolicy.SOURCE)
@Target({TYPE,FIELD,CONSTRUCTOR})
public @interface MyAnnotation {
    String value() default "asd";
}
