//����4-1 ��ӡ��ͬ��ͼ��
import java.util.Scanner;

class shape{
    private double a;
    private double b;

}

public class Java_11_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("��������Ҫ����״");
        String s = input.next();
        if (s == "Բ"){
            System.out.println("����뾶");
            a = input.nextInt();
            yuan(a);
        } else if (s == "��") {
            System.out.println("���볤����ֵ");
            a = input.nextInt();
            System.out.println("��������ֵ");
            b = input.nextInt();
            fang(a,b);
        } else {
            System.out.printf("Ŀǰû��֧�ֵĴ���״");
        }

    }
    public static double yuan(double a){
        return a*a*3.14;
    }
    public static double fang(double a,double b){
        return a*b;
    }

}
