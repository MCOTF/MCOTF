public class ����_ѧ���ɼ� {
	public static void main(String[] args) {
		int[] score= {72,89,65,58,87,91,53,82,71,93,76,68};
		int n= score[0];
		int max= score[0];
		//��߷�
		//����
		for (int j=0;j<score.length-1;j++) {
			for (int i=0;i<score.length-1-j;i++) {//
				if(score[i] > score[i+1]) {
				
				//��������-������ʱ�ռ�temp
				//�Ƚ�i����temp
					int temp=score[i];
				//�ٽ�i+1����i
					score[i]=score[i+1];
				//���temp(i)����i+1
					score[i+1]=temp;
				}
			}
		}
		
		System.out.println("��߷��ǣ�"+score[score.length-1]);
		//ƽ���ɼ�
		
		for (int k=0;k<score.length;k++) {
				max=max+score[k];
		}
		System.out.println("ƽ���ɼ��ǣ�"+max/score.length);
	
	}

}
