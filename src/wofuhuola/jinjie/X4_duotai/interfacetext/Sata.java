package wofuhuola.jinjie.X4_duotai.interfacetext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:02
 * @Description:
写一段符合如下要求的代码，体现对java多态的理解。

在硬盘标准上有一种硬盘标准叫sata硬盘(这里可以看作interface)，
sata硬盘应具备读（read）与写(write)两种方法。
实现了sata接口的硬盘分为两类，1、机械硬盘，2、固态硬盘。
在本题中，当调用这两种硬盘的读写的方法时分别输出不同的内容即可表示实现的方法。
 */
public interface Sata {
    public void read();
    public void write();
}
