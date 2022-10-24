package com.MCOTF;

public class 方法_取数组最大值 {
	public static void main(String[] args) {
		int[] cj = {90,89,83,92,94,78,91};
		int[] cj1= {66,78,53,99,80,79};
		
		//两种输出方法
		getMax(cj);
//	    System.out.println(getMax(cj1));
		
	}
	//方法取最大值
	public static void getMax(int[] A) {//声明方法
		int max= A[0];//建立最大值容器
		for (int i=0;i<A.length;i++) {
			
			if(A[i]>max) {//取最大值
				max=A[i];//赋值
			}
		}
		System.out.println("数组"+A+"的最大值："+max);
	//return max;
	}
	


}
