package com.MCOTF;

public class 冒泡排序 {
	public static void main(String[] args) {
		//课本来源：P57
		//思路：最大值再后面，最小值在前面，先输出排序前的数组，然后再输出排序后的数组
		//依次排序，遍历输出
		int arr[]= {9,8,3,5,2};
		
		//8 3 5 2 【9】   固定9
		//3 5 2 【8 9】  固定89
		//3 2 【5 8 9】 固定589
		//2 【3 5 8 9】固定3589
		
		for (int j=0;j<arr.length-1;j++) {
			for (int i=0;i<arr.length-1-j;i++) {//
				if(arr[i] > arr[i+1]) {
				
				//交换数据-建立临时空间temp
				//先将i放入temp
					int temp=arr[i];
				//再将i+1放入i
					arr[i]=arr[i+1];
				//最后将temp(i)放入i+1
					arr[i+1]=temp;
				}
			}
		}
		
		//遍历arr
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
