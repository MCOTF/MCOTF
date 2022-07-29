package com.MCOTF;
import java.util.Scanner;
public class 数组输入 {
	public static void main(String[] args) {
		
		String []name=new String[100];
		//下标0-99
		
		
		Scanner input=new Scanner(System.in);
		
		name[1]=input.next();
		name[2]=input.next();
		
		//使用for循环的形式赋值数组
		for(int i=0;i<100;i++) {//推荐i从0开始，正好能对应数组下标
			name[i]=input.next();
		}
		
		
		//读取数组长度length
		System.out.println(name.length);//name有100，name.length也为100
		//利用.length建立循环输入
		for(int i=0;i<=name.length-1;i++) {
			name[i]=input.next();
		}
		
		
		//编写一个静态赋值年龄的数组，保存6个人的年龄保存到一个数组里，分别把年龄显示输出
		
		//静态初始化
		int []age=new int[] {18,19,20,19,18,19};
		//int []age {18,19,20,19,18}//第二种方法
		
		//循环输出
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		//姓名数组长度为5，通过键盘实现输入姓名，并进行输出
		
		
	}
	
	
}
