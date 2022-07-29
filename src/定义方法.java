package com.MCOTF;

public class 定义方法 {
	public static void main(String[] args) {
	//入口函数
		
	//方法无返回值时，返回值类型用void表示。一旦有返回值，方法体必须使用return返回此类型的值。
	//方法名（小驼峰式）见名知义
	//方法调用 可以嵌套
		
		useSum(10,20);//调用方法useSum
		useSum(99,99);
		useSum(9999,9);
		System.out.println(useSum(10,20));//打印调用的方法
		
	}//方法声明 不能嵌套
	
	public static int useSum(int a,int b) {
//  公共   静态 int返回值 useSum方法名 (形参int a,形参int b)
		
		//方法体
		int c=a+b;
		return c;//返回c值到useSum
		//return a+b;也可
	}
}
