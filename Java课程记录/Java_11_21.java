//案例4-1 打印不同的图形
import java.util.Scanner;

class shape{
    private double a;
    private double b;

}

public class Java_11_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("输入你想要的形状");
        String s = input.next();
        if (s == "圆"){
            System.out.println("输入半径");
            a = input.nextInt();
            yuan(a);
        } else if (s == "方") {
            System.out.println("输入长的数值");
            a = input.nextInt();
            System.out.println("输入宽的数值");
            b = input.nextInt();
            fang(a,b);
        } else {
            System.out.printf("目前没有支持的此形状");
        }

    }
    public static double yuan(double a){
        return a*a*3.14;
    }
    public static double fang(double a,double b){
        return a*b;
    }

}
