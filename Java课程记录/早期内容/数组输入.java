package com.MCOTF;
import java.util.Scanner;
public class �������� {
	public static void main(String[] args) {
		
		String []name=new String[100];
		//�±�0-99
		
		
		Scanner input=new Scanner(System.in);
		
		name[1]=input.next();
		name[2]=input.next();
		
		//ʹ��forѭ������ʽ��ֵ����
		for(int i=0;i<100;i++) {//�Ƽ�i��0��ʼ�������ܶ�Ӧ�����±�
			name[i]=input.next();
		}
		
		
		//��ȡ���鳤��length
		System.out.println(name.length);//name��100��name.lengthҲΪ100
		//����.length����ѭ������
		for(int i=0;i<=name.length-1;i++) {
			name[i]=input.next();
		}
		
		
		//��дһ����̬��ֵ��������飬����6���˵����䱣�浽һ��������ֱ��������ʾ���
		
		//��̬��ʼ��
		int []age=new int[] {18,19,20,19,18,19};
		//int []age {18,19,20,19,18}//�ڶ��ַ���
		
		//ѭ�����
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		//�������鳤��Ϊ5��ͨ������ʵ���������������������
		
		
	}
	
	
}
