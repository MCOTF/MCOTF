package com.MCOTF;
import java.util.Scanner;//引用工具类
public class 数组输入和输出实例 {
	
	public static void main(String[] args) {
		//姓名数组长度为5，通过键盘实现输入姓名，并进行输出
		String []name=new String[5];
		
		Scanner input=new Scanner(System.in);//创建输入对象
		
		//利用.length建立循环输入
		for(int i=0;i<name.length;i++) {
			name[i]=input.next();
		}
		
		//循环输出
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
	}

}
