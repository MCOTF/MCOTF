package com.MCOTF;

public class 复习_构造方法 {
	public static void main(String[] args) {
		//构造初始值(姓名，年龄，学号)
		复习 dx1=new 复习("石敬毅",-20,"20211030300024");
		
		System.out.println(dx1.getName());
		System.out.println(dx1.getAge());
		System.out.println(dx1.getNo());
		
	}

}
