//����4-1 ��ӡ��ͬ��ͼ��
import java.util.Scanner;

class shape{//û����
    private double a;
    private double b;

    //getter��setter����
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
class yuan extends shape{//�̳�shape����
    public static double size(double a){
        return a*a*3.14;//��ӡ��ͬ��ͼ�Σ������ͼ��ֱ����printҲ����
    }
}
class fang extends shape{//�̳�shape����
    public static double size(double a,double b){
        return a*b;
    }
    public static void print(double a,double b){//������һ����ӡͼ���ķ���
        for (int i = 0;i > b;i++){
            for (int j = 0;j > a;j++){
                System.out.print("��");
            }
            System.out.println();//����������
        }
    }
}

public class Java_11_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;

        System.out.println("��������Ҫ����״(1ΪԲ�Σ�2Ϊ����)");
        int s = input.nextInt();
        if (s == 1){//�����Ӷ��ͼ���Ƽ���switch����д��ʱ��˳����if����ʵҲ����ν����ҪĿ����Ϊ��ƥ������ؼ���
            System.out.println("����뾶");
            a = input.nextDouble();
            System.out.println(yuan(a));
        } else if (s == 2) {
            System.out.println("���볤����ֵ");
            a = input.nextDouble();
            System.out.println("��������ֵ");
            b = input.nextDouble();
            System.out.println(fang(a,b));
        } else {
            System.out.println("Ŀǰû��֧�ֵĴ���״");
        }
    }
    public static double yuan(double a){//�ڶ��ַ���������������
        return a*a*3.14;
    }
    public static double fang(double a,double b){
        return a*b;
    }
}
