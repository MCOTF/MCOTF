package com.MCOTF;

public class ð������ {
	public static void main(String[] args) {
		//�α���Դ��P57
		//˼·�����ֵ�ٺ��棬��Сֵ��ǰ�棬���������ǰ�����飬Ȼ�����������������
		//�������򣬱������
		int arr[]= {9,8,3,5,2};
		
		//8 3 5 2 ��9��   �̶�9
		//3 5 2 ��8 9��  �̶�89
		//3 2 ��5 8 9�� �̶�589
		//2 ��3 5 8 9���̶�3589
		
		for (int j=0;j<arr.length-1;j++) {
			for (int i=0;i<arr.length-1-j;i++) {//
				if(arr[i] > arr[i+1]) {
				
				//��������-������ʱ�ռ�temp
				//�Ƚ�i����temp
					int temp=arr[i];
				//�ٽ�i+1����i
					arr[i]=arr[i+1];
				//���temp(i)����i+1
					arr[i+1]=temp;
				}
			}
		}
		
		//����arr
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
