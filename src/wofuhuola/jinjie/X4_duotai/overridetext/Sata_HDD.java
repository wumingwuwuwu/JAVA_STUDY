package wofuhuola.jinjie.X4_duotai.overridetext;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/7 - 0:05
 * @Description:
 */
public class Sata_HDD extends Sata {
    @Override
    protected void read(){
        System.out.println("机械硬盘的读取方式");
    }
    @Override
    protected void write(){
        System.out.println("机械硬盘的写入方式");
    }
}
