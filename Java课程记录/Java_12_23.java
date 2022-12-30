//Java_12_23：案例5-2

import java.util.Scanner;
//import java.util.*;//debug用，以防万一

public class Java_12_23 {
    public static void main(String[] args) {
        Scanner userid = new Scanner(System.in);//创建控制台输入对象
        System.out.println("请输入您的用户名：");
        String username = userid.nextLine();//接收字符串
        String password = reverse(username);//调用方法
        System.out.println("用户名"+username+"注册成功，初始密码为："+password);//姓名和密码直接在一行输出完成
    }

    //声明
    //字符串反转reverse (StringBuilder)
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();//反转字符串
    }
}