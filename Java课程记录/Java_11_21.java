//案例4-1 打印不同的图形
import java.util.Scanner;

class shape{//没用上
    private double a;
    private double b;

    //getter与setter方法
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
class yuan extends shape{//继承shape变量
    public static double size(double a){
        return a*a*3.14;//打印不同的图形，如果是图案直接走print也可以
    }
}
class fang extends shape{//继承shape变量
    public static double size(double a,double b){
        return a*b;
    }
    public static void print(double a,double b){//留下了一个打印图案的方法
        for (int i = 0;i > b;i++){
            for (int j = 0;j > a;j++){
                System.out.print("■");
            }
            System.out.println();//留空做换行
        }
    }
}

public class Java_11_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;

        System.out.println("输入你想要的形状(1为圆形，2为方形)");
        int s = input.nextInt();
        if (s == 1){//如果添加多个图形推荐用switch，刚写的时候顺手用if了其实也无所谓，主要目的是为了匹配输入关键字
            System.out.println("输入半径");
            a = input.nextDouble();
            System.out.println(yuan(a));
        } else if (s == 2) {
            System.out.println("输入长的数值");
            a = input.nextDouble();
            System.out.println("输入宽的数值");
            b = input.nextDouble();
            System.out.println(fang(a,b));
        } else {
            System.out.println("目前没有支持的此形状");
        }
    }
    public static double yuan(double a){//第二种方法，在主类里面
        return a*a*3.14;
    }
    public static double fang(double a,double b){
        return a*b;
    }
}
