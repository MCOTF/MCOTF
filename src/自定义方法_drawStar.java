package com.MCOTF;

public class �Զ��巽��_drawStar {
	public static void main(String[] args) {
		drawStar(3);//���� ���Ƿ���
		drawStar(5);
		drawStar(7);
	}
	
	public static void drawStar(int a){//���Ƿ���
		for(int i=0;i<=a;i++) {//��������
			for(int j=0;j<=i;j++) {//��������
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
