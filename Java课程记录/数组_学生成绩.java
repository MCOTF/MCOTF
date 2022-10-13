public class 数组_学生成绩 {
	public static void main(String[] args) {
		int[] score= {72,89,65,58,87,91,53,82,71,93,76,68};
		int n= score[0];
		int max= score[0];
		//最高分
		//排序
		for (int j=0;j<score.length-1;j++) {
			for (int i=0;i<score.length-1-j;i++) {//
				if(score[i] > score[i+1]) {
				
				//交换数据-建立临时空间temp
				//先将i放入temp
					int temp=score[i];
				//再将i+1放入i
					score[i]=score[i+1];
				//最后将temp(i)放入i+1
					score[i+1]=temp;
				}
			}
		}
		
		System.out.println("最高分是："+score[score.length-1]);
		//平均成绩
		
		for (int k=0;k<score.length;k++) {
				max=max+score[k];
		}
		System.out.println("平均成绩是："+max/score.length);
	
	}

}
