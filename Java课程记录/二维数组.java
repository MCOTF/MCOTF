package com.MCOTF;

public class 二维数组 {
	public static void main(String[] args) {
		//二维数组是特殊的一维数组，特殊的数组中每一个元素是一维数组
		
		//二维数组的静态初始化[行][列]
		String[][]array = {
				{"高等数学","英语","html","数据库","java"},//数组间用逗号隔开
						
				{"zs","ls","ww"},
				
				{"lucy","jack","rose"}
				
				};
		System.out.println(array.length);//显示数组长度--2(元素的个数)
		System.out.println(array[0].length);//显示二维数组第一个元素的长度
		System.out.println(array[1].length);//显示二维数组第二个元素的长度
		System.out.println(array[0][0]);//访问"高等数学"的下标
		System.out.println(array[0][4]);//访问"JAVA"的下标
//		System.out.println(array[0][5]);//报错：下标越界
		
		//声明二维数组：行不能省略，列可以省略
		
		//二维数组的动态初始化
		String[][]array1=new String[4][5];//四行五列
		System.out.println(array1[0][0]);
		
		//二维数组遍历
		//外层循环控制行数
		for(int i=0;i<array[i].length-1;i++) {//长度-1避免下标越界
			for(int j=0;j<array[i].length;j++) {//内层循环输出每一行的元素
				System.out.print(array[i][j]+" ");
			}
			System.out.println();//换行
		}
		
		

		
	}

}
