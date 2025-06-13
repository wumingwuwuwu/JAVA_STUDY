package wofuhuola.jinjie.fangfayinyong.Breach01;

import java.util.ArrayList;
import java.util.Collections;

public class FangFaYinYongDemo1 extends ParentClass {
    public static void main(String[] args) {
        new FangFaYinYongDemo1().demoSuperReference();
    }

    public void demoSuperReference() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "赵敏", "周芷若", "张强", "张三丰");

        // 引用父类的成员方法
        list.stream()
                .filter(super::filterParent) // 使用super::引用父类方法
                .forEach(System.out::println);

        /* 输出结果：
           张无忌
           周芷若
           张三丰
        */
    }

    // 子类自己的过滤方法
    public boolean filterChild(String s) {
        return s.startsWith("张");
    }
}