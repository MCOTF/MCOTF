//Java_12_23：案例5-2
//G1S:MCOTF__ST
//思路：name接收字符串，pwd进行字符串翻转，并进行print打印

import java.util.Scanner;
//import java.util.*;//debug用，以防万一
public class Java_12_23 {
    public static void main(String[] args) {
        Scanner userid = new Scanner(System.in);//创建控制台输入对象
        System.out.println("请输入你的用户名：");
        String name = userid.nextLine();//name接收字符串
        String pwd = reverse(name);//pwd调用方法
        System.out.println("您的用户名是："+name+"密码是："+pwd);//姓名和密码直接在一行输出完成
    }
    //方法声明
    //字符串反转reverse (StringBuilder.reverse.toString)
    public static String reverse(String str) {//不需要对方法加同步锁，避免多余性能开销则仅使用StringBuilder即可
        return new StringBuilder(str).reverse().toString();//反转字符串
    }
}