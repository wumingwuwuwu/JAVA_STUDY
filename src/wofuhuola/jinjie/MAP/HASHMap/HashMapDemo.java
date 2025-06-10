package wofuhuola.jinjie.MAP.HASHMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> StudentOrigin= new HashMap<Student,String>();
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入第"+(i+1)+"个学生的名字：");
//            String name = s.nextLine();
//            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
//            int age = s.nextInt();
//            s.nextLine();
//            Student student = new Student(name,age);
//            System.out.println("请输入第"+(i+1)+"个学生的籍贯：");
//            String origin = s.nextLine();
//            StudentOrigin.put(student,origin);
//        }

        Student s1 = new Student("林青霞", 28);
        Student s2 = new Student("风清扬", 31);
        Student s3 = new Student("王重阳", 200);
        Student s4 = new Student("林青霞", 28);
        Student s5 = new Student("风清扬", 20);
        Student s6 = new Student("王阳", 100);

        // 添加元素
        StudentOrigin.put(s1, "山东");
        StudentOrigin.put(s2, "河北");
        StudentOrigin.put(s3, "陕西");
        StudentOrigin.put(s4, "山西");
        StudentOrigin.put(s5, "河南");
        StudentOrigin.put(s6, "湖南");

        StudentOrigin.forEach((student, origin) ->
                System.out.println(student.getName()+"的年龄为"+student.getAge()+"ta的籍贯是"+origin));
        StudentOrigin.forEach((student,origin) ->
                System.out.printf(String.format("%s的年龄为%d，ta的籍贯是%s%n",
                        student.getName(),
                        student.getAge(),
                        origin))
        );
        System.out.println("____________________________");

        Set<Student> set = StudentOrigin.keySet();
        for (Student student : set){
            String origin = StudentOrigin.get(student);
            System.out.printf("%s的年龄为%d，ta的籍贯是%s%n",
                    student.getName(),
                    student.getAge(),
                    origin
            );
        }




    }
}
