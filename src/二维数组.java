package com.MCOTF;

public class ��ά���� {
	public static void main(String[] args) {
		//��ά�����������һά���飬�����������ÿһ��Ԫ����һά����
		
		//��ά����ľ�̬��ʼ��[��][��]
		String[][]array = {
				{"�ߵ���ѧ","Ӣ��","html","���ݿ�","java"},//������ö��Ÿ���
						
				{"zs","ls","ww"},
				
				{"lucy","jack","rose"}
				
				};
		System.out.println(array.length);//��ʾ���鳤��--2(Ԫ�صĸ���)
		System.out.println(array[0].length);//��ʾ��ά�����һ��Ԫ�صĳ���
		System.out.println(array[1].length);//��ʾ��ά����ڶ���Ԫ�صĳ���
		System.out.println(array[0][0]);//����"�ߵ���ѧ"���±�
		System.out.println(array[0][4]);//����"JAVA"���±�
//		System.out.println(array[0][5]);//�����±�Խ��
		
		//������ά���飺�в���ʡ�ԣ��п���ʡ��
		
		//��ά����Ķ�̬��ʼ��
		String[][]array1=new String[4][5];//��������
		System.out.println(array1[0][0]);
		
		//��ά�������
		//���ѭ����������
		for(int i=0;i<array[i].length-1;i++) {//����-1�����±�Խ��
			for(int j=0;j<array[i].length;j++) {//�ڲ�ѭ�����ÿһ�е�Ԫ��
				System.out.print(array[i][j]+" ");
			}
			System.out.println();//����
		}
		
		

		
	}

}
