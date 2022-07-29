package com.MCOTF;

public class 自定义方法_drawStar {
	public static void main(String[] args) {
		drawStar(3);//调用 画星方法
		drawStar(5);
		drawStar(7);
	}
	
	public static void drawStar(int a){//画星方法
		for(int i=0;i<=a;i++) {//控制行数
			for(int j=0;j<=i;j++) {//控制星数
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
