//Java_12_23������5-2

import java.util.Scanner;
//import java.util.*;//debug�ã��Է���һ

public class Java_12_23 {
    public static void main(String[] args) {
        Scanner userid = new Scanner(System.in);//��������̨�������
        System.out.println("�����������û�����");
        String username = userid.nextLine();//�����ַ���
        String password = reverse(username);//���÷���
        System.out.println("�û���"+username+"ע��ɹ�����ʼ����Ϊ��"+password);//����������ֱ����һ��������
    }

    //����
    //�ַ�����תreverse (StringBuilder)
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();//��ת�ַ���
    }
}