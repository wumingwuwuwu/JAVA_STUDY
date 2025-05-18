package wofuhuola.jinjie.duotai.abstracttext;

import wofuhuola.jinjie.duotai.interfacetext.Sata;

import java.util.Scanner;

/**
 * 多态可以灵活的创建对象
 */

public class text {
    public static void main(String[] args) {
        System.out.println("要选什么硬盘呢");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean b ;
        if( a >= 0 ){
            b = true;
        }else{
            b = false;
        }
        Service_Sata_A serviceSataA = new Service_Sata_A();
        Sata sata = serviceSataA.contact(b);
        sata.read();
        sata.write();

    }
}
