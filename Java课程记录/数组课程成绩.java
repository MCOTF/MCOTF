package com.MCOTF;
import java.util.Scanner;//���빤����
public class ����γ̳ɼ� {
	public static void main(String[] args) {
		
		double []score=new double[4];//��������
		//ͨ�������������ſγ̵ĳɼ�
		Scanner input=new Scanner(System.in);//�����������

  		//��һ�ſγ̵ĳɼ�Ϊ��//score[0]=90.0;
//		System.out.println("��һ�ſγ̵ĳɼ���");
//		score[0]=input.nextDouble();
		//�ڶ��ſγ̵ĳɼ�Ϊ��
//		score[1]=90.0;
//		
		//ѭ������
		for(int i=0;i<score.length;i++) {
			System.out.println("��"+(i+1)+"�ſγ̵ĳɼ���");
			score[i]=input.nextDouble();
		}
		//ѭ�����
		for(int i=0;i<score.length;i++) {
			System.out.println("��"+(i+1)+"�ſγ̵ĳɼ�����"+score[i]);
		}
		
	}

}
