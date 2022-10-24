package com.MCOTF;

public class 方法_圆的周长与面积 {
	public static void main(String[] args) {
		zCMJ(6);//调用周长面积方法
		
	}
	public static void zCMJ(int banjing) {//声明周长面积方法
		//double pi=3.14
		System.out.println("周长"+ 2*Math.PI*banjing);//Math.PI圆周率
		System.out.println("面积"+ Math.PI*Math.pow(banjing, 2));//Math.pow	乘方
	}
}
