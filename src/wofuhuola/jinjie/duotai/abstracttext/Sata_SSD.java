package wofuhuola.jinjie.duotai.abstracttext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:51
 * @Description:
 */
public class Sata_SSD extends Sata {
    @Override
    void read() {
        System.out.println("固态硬盘的读取方式");
    }

    @Override
    void write() {
        System.out.println("固态硬盘的写入方式");
    }
}
