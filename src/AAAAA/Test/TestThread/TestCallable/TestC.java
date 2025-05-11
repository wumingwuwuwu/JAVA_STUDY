package AAAAA.Test.TestThread.TestCallable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @Auther: wumingwuwuwu
 * @Date: 2021/5/25 - 11:12
 * @Description:
 * @version: 1.0
 */
public class TestC implements Callable<Integer> {
    /**
     * 1.实现Callable接口，可以不带泛型，如果不带泛型，那么Call方法的返回值就是Object类型
     * 如果带泛型，那么call的返回值就是泛型对应的类型
     * 从call方法看到：方法有返回值，可以抛出异常
     *
    * */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);//返回10以内的随机数
    }
}
