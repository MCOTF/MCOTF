package com.MCOTF;

public class �������2_ʵ���� {
	public static void main(String[] args) {
		
		//�����������﷨
		
		/**
		 * ���ں�Ϊ��ֵ
		 * ����ִ��new ��������ִ������ ������
		 * */

		//���� ������=new ����();
		������� zs=new �������(); //����ʵ����(�ֲ�����zs:����)
		//zs����Ϊ"�������"���ͣ���
		
		������� ls=new �������(); //�����ڶ�������(�ֲ�����ls:����)
		
		//zs������name ��age ��sex�����ԣ���Դ���������class��
		//��zs�ĸ����Ը�ֵ
		
		zs.setAge(-20);//����Ϊ-20�Դ�
		
		zs.Name="������";
		zs.sno="202261001";
		zs.ssex="��";
// 		zs.addr="����";//�ݲ���ֵ
				
		//���(��������)��������.����ֵ
		System.out.println("����:"+zs.Name);
		System.out.println("ѧ��:"+zs.sno);
		System.out.println("סַ:"+zs.addr);//���δ��ֵ�����ԣ����ΪStringĬ��ֵnull
		System.out.println("�Ա�:"+zs.ssex);
		System.out.println("����:"+zs.getAge());//��ȡ��װ�������
		
		//����
		zs.chiFan();
		
	}
}
