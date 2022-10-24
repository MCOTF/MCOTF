package com.MCOTF;

public class 构造方法_面向对象 {
	public static void main(String[] args) {
		//传默认值
		构造方法 s1=new 构造方法("jack1",20);
		//一旦定义了构造方法，如果不去传参的话就会报错
//		构造方法 s2=new 构造方法();//报错
		s1.read();
	}

}
