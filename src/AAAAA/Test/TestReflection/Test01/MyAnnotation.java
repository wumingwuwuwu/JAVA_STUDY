package AAAAA.Test.TestReflection.Test01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/30 - 12:53
 * @Description:
 * @version: 1.0
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
/**
 * @Target:定义该注解可以标记哪些类型的元素
 * @Retention:表明注解的生命周期
 */
public @interface MyAnnotation {
    String value();
}
