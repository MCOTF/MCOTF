package com.MCOTF;
import java.util.Scanner;//���ù�����
public class ������������ʵ�� {
	
	public static void main(String[] args) {
		//�������鳤��Ϊ5��ͨ������ʵ���������������������
		String []name=new String[5];
		
		Scanner input=new Scanner(System.in);//�����������
		
		//����.length����ѭ������
		for(int i=0;i<name.length;i++) {
			name[i]=input.next();
		}
		
		//ѭ�����
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
	}

}
