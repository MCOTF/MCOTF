package com.MCOTF;

public class ���鳣������ {
	public static void main(String[] args) {
//		int[] x;
//		x=new int[100];
//		System.out.println(x);
		//���������ȡ��(С/��)ֵ
		int[] cj = {90,89,83,92,94,78,91};
		//������һ��Ԫ��Ϊ��Сֵ
		int min= cj[0];
		
		//�������
		for (int i=0;i<cj.length;i++) {
			
			if(cj[i]<min) {//ȡ��Сֵ
				min=cj[i];//��ֵ
			}
		}
		
		System.out.println("��Сֵ��"+min);
		
		
		//forѭ������
		String []ck= {"�ߵ���ѧ","Ӣ��","html","���ݿ�","java"};
		//����
		for (int i=0;i<ck.length;i++) {
			System.out.println(ck[i]);
		}
		//��������
		String[] name= {"zs","ls","ww"};
		

	}

}
