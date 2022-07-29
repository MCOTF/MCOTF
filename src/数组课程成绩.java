package com.MCOTF;
import java.util.Scanner;//引入工具类
public class 数组课程成绩 {
	public static void main(String[] args) {
		
		double []score=new double[4];//声明创建
		//通过键盘输入四门课程的成绩
		Scanner input=new Scanner(System.in);//创建输入对象

  		//第一门课程的成绩为；//score[0]=90.0;
//		System.out.println("第一门课程的成绩：");
//		score[0]=input.nextDouble();
		//第二门课程的成绩为；
//		score[1]=90.0;
//		
		//循环输入
		for(int i=0;i<score.length;i++) {
			System.out.println("第"+(i+1)+"门课程的成绩：");
			score[i]=input.nextDouble();
		}
		//循环输出
		for(int i=0;i<score.length;i++) {
			System.out.println("第"+(i+1)+"门课程的成绩：是"+score[i]);
		}
		
	}

}
