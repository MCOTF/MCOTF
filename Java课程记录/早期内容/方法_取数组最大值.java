package com.MCOTF;

public class ����_ȡ�������ֵ {
	public static void main(String[] args) {
		int[] cj = {90,89,83,92,94,78,91};
		int[] cj1= {66,78,53,99,80,79};
		
		//�����������
		getMax(cj);
//	    System.out.println(getMax(cj1));
		
	}
	//����ȡ���ֵ
	public static void getMax(int[] A) {//��������
		int max= A[0];//�������ֵ����
		for (int i=0;i<A.length;i++) {
			
			if(A[i]>max) {//ȡ���ֵ
				max=A[i];//��ֵ
			}
		}
		System.out.println("����"+A+"�����ֵ��"+max);
	//return max;
	}
	


}
