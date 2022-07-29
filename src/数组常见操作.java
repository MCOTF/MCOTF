package com.MCOTF;

public class 数组常见操作 {
	public static void main(String[] args) {
//		int[] x;
//		x=new int[100];
//		System.out.println(x);
		//数组遍历，取最(小/大)值
		int[] cj = {90,89,83,92,94,78,91};
		//声明第一个元素为最小值
		int min= cj[0];
		
		//数组遍历
		for (int i=0;i<cj.length;i++) {
			
			if(cj[i]<min) {//取最小值
				min=cj[i];//赋值
			}
		}
		
		System.out.println("最小值："+min);
		
		
		//for循环遍历
		String []ck= {"高等数学","英语","html","数据库","java"};
		//遍历
		for (int i=0;i<ck.length;i++) {
			System.out.println(ck[i]);
		}
		//保存姓名
		String[] name= {"zs","ls","ww"};
		

	}

}
