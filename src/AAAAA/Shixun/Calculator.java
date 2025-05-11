package AAAAA.Shixun;

/*
 * @Auther:wumingwuwuwu
 * @Date: 2020/12/4 - 12 - 04 - 15:05
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calculator extends JFrame {
    //作文本框，框里放数字和运算符
    private JTextField jt = new JTextField(250);
    double a;
    //储存算数运算之后的结果
    double b;
    boolean isRun = false;

    //将结果转换成字符后来储存，同时代表运算符左侧的操作数
    String s = "";

    //操作符右侧的数字的字符串表示形式。 s=s+num
    String num = "";

    //存储运算符
    String run = null;

    //定义一个构造方法。用来创建窗体
    public Calculator(){
        //本方法是用来设置窗体里面的按钮和文本框的布局，瀑布式的布局方式
        setLayout(null);
        //以电脑屏幕左上角为原点坐标为0，0
        jt.setBounds(0,0,300,300);
        Container c = getContentPane();
        jt.setBounds(5,5,285,30);
        c.add(jt);
        jt.setText(null);

        JButton b1=new JButton("7");
        JButton b2=new JButton("8");
        JButton b3=new JButton("9");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("1");
        JButton b8=new JButton("2");
        JButton b9=new JButton("3");
        JButton b10=new JButton(".");
        JButton b11=new JButton("0");
        JButton b12=new JButton("");
        JButton b13=new JButton("+");
        JButton b14=new JButton("-");
        JButton b15=new JButton("*");
        JButton b16=new JButton("/");
        JButton b17=new JButton("C");
        JButton b18=new JButton("x!");
        JButton b19=new JButton("^");
        JButton b20=new JButton("=");

        b1.setBounds(10,50,50,30);
        b2.setBounds(65,50,50,30);
        b3.setBounds(120,50,50,30);
        b4.setBounds(10,85,50,30);
        b5.setBounds(65,85,50,30);
        b6.setBounds(120,85,50,30);
        b7.setBounds(10,120,50,30);
        b8.setBounds(65,120,50,30);
        b9.setBounds(120,120,50,30);
        b10.setBounds(10,155,50,30);
        b11.setBounds(65,155,50,30);
        b12.setBounds(120,155,50,30);
        b13.setBounds(180,50,50,30);
        b14.setBounds(180,85,50,30);
        b15.setBounds(180,120,50,30);
        b16.setBounds(180,155,50,30);
        b17.setBounds(235,50,50,30);
        b18.setBounds(235,85,50,30);
        b19.setBounds(235,120,50,30);
        b20.setBounds(235,155,50,30);

        c.add(b1 );
        c.add(b2 );
        c.add(b3 );
        c.add(b4 );
        c.add(b5 );
        c.add(b6 );
        c.add(b7 );
        c.add(b8 );
        c.add(b9 );
        c.add(b10);
        c.add(b11);
        c.add(b12);
        c.add(b13);
        c.add(b14);
        c.add(b15);
        c.add(b16);
        c.add(b17);
        c.add(b18);
        c.add(b19);
        c.add(b20);

        //按钮事件
        //处理数字
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("7");            //将数字7设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("8");            //将数字8设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("9");            //将数字9设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("4");            //将数字4设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("5");            //将数字5设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("6");            //将数字6设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("1");            //将数字1设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("2");            //将数字2设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("3");            //将数字3设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jt.getText()!=null){
                    jt.setText(".");            //将.设置到文本框中
                    num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                    jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                }else{
                    JOptionPane.showMessageDialog(null,"第一位不能是小数点");
                }

                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("0");            //将数字0设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");            //将空设置到文本框中
                num = num + jt.getText();   //将输入到文本框中的内容一个一个进行拼接
                jt.setText(num);            //就是将文本框中的内容拼接好之后在获取到，将其显示到文本框中
                jt.requestFocus();          //让一个成为焦点（就是鼠标滑倒该位置会有选中的特效）
            }
        });
        //处理运算符
        b13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("+");//文本框显示+号
                    s = num;
                    num="";
                    run = "+";//代表运算符
                }else{
                    //jt.setText(Double.toString(a));//把a放在这里备用
                    if(run.equals("+")){
                        //如果你输入的是加号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)+Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "+";
                    }else if(run.equals("-")){
                        //如果你输入的是加号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)-Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("*")){
                        b=Double.valueOf(s)*Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "*";
                    }else if(run.equals("/")){
                        b=Double.valueOf(s)/Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "/";
                    }else if(run.equals("^")){
                        b=Math.pow(Double.valueOf(s),Double.valueOf(num));
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "^";
                    }
                }
                isRun = true;
                jt.requestFocus();//让一个按钮成为焦点
            }
        });
        b14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("-");
                    s=num;
                    num="";
                    run="-";//把减号赋给run变量，就是想实现连续减运算
                }else{
                    //jt.setText(Double.toString(a));//把a放在这里备用
                    if(run.equals("+")){
                        //如果你输入的是减号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)+Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num="";
                        run="+";
                    }else if(run.equals("-")){
                        b=Double.valueOf(s)-Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("*")){
                        b=Double.valueOf(s)*Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "*";
                    }else if(run.equals("/")){
                        b=Double.valueOf(s)/Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "/";
                    }else if(run.equals("^")){
                        b=Math.pow(Double.valueOf(s),Double.valueOf(num));
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "^";
                    }
                }
                isRun = true;
                jt.requestFocus();//让一个按钮成为焦点
            }
        });
        b15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("*");//文本框显示*号
                    s = num;
                    num="";
                    run = "*";//代表运算符
                }else{
                    //jt.setText(Double.toString(a));//把a放在这里备用
                    if(run.equals("+")){
                        //如果你输入的是减号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)+Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num="";
                        run="+";
                    }else if(run.equals("-")){
                        b=Double.valueOf(s)-Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("*")){
                        b=Double.valueOf(s)*Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "*";
                    }else if(run.equals("/")){
                        b=Double.valueOf(s)/Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "/";
                    }else if(run.equals("^")){
                        b=Math.pow(Double.valueOf(s),Double.valueOf(num));
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "^";
                    }
                }
            }
        });
        b16.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("/");
                    s = num;
                    num="";
                    run = "/";
                }else{
                    //jt.setText(Double.toString(a));//把a放在这里备用
                    if(run.equals("+")){
                        //如果你输入的是减号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)+Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num="";
                        run="+";
                    }else if(run.equals("-")){
                        b=Double.valueOf(s)-Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("*")){
                        b=Double.valueOf(s)*Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "*";
                    }else if(run.equals("/")){
                        b=Double.valueOf(s)/Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "/";
                    }else if(run.equals("^")){
                        b=Math.pow(Double.valueOf(s),Double.valueOf(num));
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "^";
                    }
                }
            }
        });
        b17.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("");
                    num="";
                    s="";
                    isRun=false;
                    run = null;//代表运算符
                    jt.requestFocus();//让一个按钮成为焦点
                }
            }
        });
        b18.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    s=num;
                    double c;
                    c=Double.valueOf(s);
                    if(c>0&&((c%2==0)||(c%2==1))){
                        jt.setText("x!");
                        num="";
                        run="x!";

                    }
                    jt.requestFocus();//让一个按钮成为焦点
                }
            }
        });
        b19.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(!isRun){
                    jt.setText("^");
                    s=num;
                    num="";
                    run="^";

                }else{
                    //jt.setText(Double.toString(a));//把a放在这里备用
                    if(run.equals("+")){
                        //如果你输入的是减号，那么就将s和num变量储存的字符串转换成double类型
                        b=Double.valueOf(s)+Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num="";
                        run="-";
                    }else if(run.equals("-")){
                        b=Double.valueOf(s)-Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("*")){
                        b=Double.valueOf(s)*Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("/")){
                        b=Double.valueOf(s)/Double.valueOf(num);
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }else if(run.equals("^")){
                        b=Math.pow(Double.valueOf(s),Double.valueOf(num));
                        s=Double.toString(b);
                        jt.setText(s);
                        num = "";
                        run = "-";
                    }
                }
            }
        });
        b20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                if(run.equals("+")){
                    a=Double.valueOf(s)+Double.valueOf(num);

                }else if(run.equals("-")){
                    a=Double.valueOf(s)-Double.valueOf(num);
                }else if(run.equals("*")){
                    a=Double.valueOf(s)*Double.valueOf(num);
                }else if(run.equals("/")){
                    a=Double.valueOf(s)/Double.valueOf(num);
                }else if(run.equals("x!")){
                    double c,result;
                    double d=Double.valueOf(s);
                    result=c=d;
                    for(int i=1;i<d;i++){
                        result=result*(c-i);
                    }
                    a=result;
                }else if(run.equals("^")){
                    a=Math.pow(Double.valueOf(s), Double.valueOf(num));


                }
                jt.setText(Double.toString(a));
                isRun=true;
                run="=";
                jt.requestFocus();//让一个按钮成为焦点
            }

        });

    }

    public static void init(Calculator frame, int width , int height){

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(width,height);
        frame.setTitle("计算器");
        frame.setVisible(true);

    }



    public static void main(String[] args) {

        init(new Calculator(),310,250);

    }

}
