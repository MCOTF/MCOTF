package com.MCOTF;

public class ���巽�� {
	public static void main(String[] args) {
	//��ں���
		
	//�����޷���ֵʱ������ֵ������void��ʾ��һ���з���ֵ�����������ʹ��return���ش����͵�ֵ��
	//��������С�շ�ʽ������֪��
	//�������� ����Ƕ��
		
		useSum(10,20);//���÷���useSum
		useSum(99,99);
		useSum(9999,9);
		System.out.println(useSum(10,20));//��ӡ���õķ���
		
	}//�������� ����Ƕ��
	
	public static int useSum(int a,int b) {
//  ����   ��̬ int����ֵ useSum������ (�β�int a,�β�int b)
		
		//������
		int c=a+b;
		return c;//����cֵ��useSum
		//return a+b;Ҳ��
	}
}
