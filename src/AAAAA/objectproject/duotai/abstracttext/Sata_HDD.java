package AAAAA.objectproject.duotai.abstracttext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:50
 * @Description:
 */
public class Sata_HDD extends Sata{
    @Override
    void read() {
        System.out.println("机械硬盘的读取方式");
    }

    @Override
    void write() {
        System.out.println("机械硬盘的写入方式");
    }
}
