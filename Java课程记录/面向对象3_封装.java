package com.MCOTF;

public class 面向对象3_封装 {
	public static void main(String[] args) {
		/**
		 * 如何实现封装：
		 * 1：属性私有化private
		 * 2：设置setter（改）和getter（读）
		 */
		面向对象 ls=new 面向对象();
		ls.setAge(-20);//年龄为-20试错
		System.out.println("年龄:"+ls.getAge());//读取封装后的年龄
	}
}
