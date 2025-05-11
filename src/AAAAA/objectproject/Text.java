package AAAAA.objectproject;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/2/6 - 23:14
 * @Description:
 */
public class Text {
    public enum ErrorCodeEn {
        ONE("1"){
            @Override
            public String getDescription(){
                return "一";
            }
        },
        TWO("2"){
            @Override
            public String getDescription(){
                return "二";
            }
        },
        THREE("3"){
            @Override
            public String getDescription(){
                return "三";
            }
        };

        private String code;

        // 构造方法：enum的构造方法只能被声明为private权限或不声明权限
        private ErrorCodeEn(String number) { // 构造方法
            this.code = number;
        }

        public String getCode() { // 普通方法
            return code;
        } // 普通方法

        public abstract String getDescription(); // 抽象方法

        public static void main(String args[]) { // 静态方法
            for (ErrorCodeEn s : ErrorCodeEn.values()) {
                System.out.println("code: " + s.getCode() + ", description: " + s.getDescription());
            }
        }

    }

}
