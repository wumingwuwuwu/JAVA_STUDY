package AAAAA.TestDemo;

/**
 * @Auther: zhaoss
 * @Date: 2021/3/9 - 9:16
 * @Description:
 * @version: 1.0
 */
public class Box {
    private double width;
    private double length;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setHeight(12.1);

    }



}