package AAAAA.bjsxt;




import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        //实例化TreeMap
        Map<Users,String> map = new TreeMap<>();
        Users u1 = new Users("oldlu",18);
        Users u2 = new Users("admin",22);
        Users u3 = new Users("sxt",22);
        map.put(u1,"oldlu");
        map.put(u2,"admin");
        map.put(u3,"sxt");
        Set<Users> keys = map.keySet();
        for(Users key :keys){
            System.out.println(key+" --------- "+map.get(key));
        }
        System.out.println("---------------------------");
        Map<Student,String> treeMap = new TreeMap<>(new StudentComparator());
        Student s1 = new Student("oldlu",18);
        Student s2 = new Student("admin",22);
        Student s3 = new Student("sxt",22);
        treeMap.put(s1,"oldlu");
        treeMap.put(s2,"admin");
        treeMap.put(s3,"sxt");
        Set<Student> keys1 = treeMap.keySet();
        for(Student key :keys1){
            System.out.println(key+" ---- "+treeMap.get(key));
        }

    }
}
