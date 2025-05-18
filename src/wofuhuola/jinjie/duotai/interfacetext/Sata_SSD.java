package wofuhuola.jinjie.duotai.interfacetext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:07
 * @Description:
 */
public class Sata_SSD implements Sata {

    @Override
    public void read() {
        System.out.println("固态硬盘的读取方式");
    }

    @Override
    public void write() {
        System.out.println("固态硬盘的写入方式");
    }
}
