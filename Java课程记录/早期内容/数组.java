public class ���� {
	public static void main(String[] args) {
/**1.����2.����3.��ֵ4.����
		*1.�������� [] ������
		*2.������=new ��������[����]
		*/
		
		int []age;//����(�����ڴ�ռ�)
		//�������鵫����ֵ�Ļ�ΪĬ��ֵ��0-99���±��Ӧ��ֵ��Ϊ0
		age =new int[100];//����(�����ڴ�ռ�)new ��������[]����
		
		//ͨ�������±��ȡ��Ӧ��ֵ
		System.out.println(age[0]);//��ȡ��һ��Ԫ��
		System.out.println(age[1]);//��ȡ�ڶ���Ԫ��
	
		//StringΪclass�࣬����ĸҪ��д
		String []name=new String[100];//����/�����ϲ�
		System.out.println(name[0]);//null(������������Ĭ��ֵΪ)
		//��̬��ֵ
		name[1]="����";//�ڶ���Ԫ�ظ�ֵ
		name[2]="����";//������Ԫ�ظ�ֵ
		
		//��̬��ֵ
		//��̬��ʼ����Ҫ�ӳ���int[]������ᱨ��
		int[]age1=new int[] {18,19,20,21,10,22};//int[]Ԫ������������
		//int age1={18,19,20,21,10,22}
		System.out.println(age1[6]);//���������±�Խ�磩
		
//		arr=null;
//		System.out.println(arr[0]);//������ָ���쳣��
	}
}
