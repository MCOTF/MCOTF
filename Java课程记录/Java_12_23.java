//Java_12_23������5-2
//�����һ��ʯ����
//˼·��name�����ַ�����pwd�����ַ�����ת��������print��ӡ

import java.util.Scanner;
//import java.util.*;//debug�ã��Է���һ
public class Java_12_23 {
    public static void main(String[] args) {
        Scanner userid = new Scanner(System.in);//��������̨�������
        System.out.println("�����������û�����");
        String name = userid.nextLine();//name�����ַ���
        String pwd = reverse(name);//pwd���÷���
        System.out.println("�û���"+name+"ע��ɹ�����ʼ����Ϊ��"+pwd);//����������ֱ����һ��������
    }
    //��������
    //�ַ�����תreverse (StringBuilder.reverse.toString)
    public static String reverse(String str) {//����Ҫ�Է�����ͬ�����������˷��������ʹ��StringBuilder����
        return new StringBuilder(str).reverse().toString();//��ת�ַ���
    }
}