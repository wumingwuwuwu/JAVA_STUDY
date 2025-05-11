package AAAAA.ObjectTest.encapsulatest;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2021/1/29 - 22:47
 * @Description:
 */
public class MobileNumber {

    //为了无法直接修改数据所以用private将属性封在当前类中
    private String owner;               //所有者
    private String areaCode = "+86";    //国家区号
    private long number ;               //手机号
    //getter方法用于读取成员变量内容
    //getter书写格式：public 成员变量类型 get成员变量名();首字母要大写
    //获取所有者名字
    public String getOwner(){
        return this.owner;
    }
    //获取国家区号
    public String getAreaCode(){
        return this.areaCode;
    }
    //获取手机号
    public long getNumber(){
        return this.number;
    }

    //setter用于设置成员变量的内容
    //setter书写格式：public void set成员变量(新的数据参数)
    //设置所有者的名字
    public void setOwner(String owner){
        this.owner = owner;
    }
    //设置手机号
    public void setNumber(long number){
        this.number = number;
    }



}
