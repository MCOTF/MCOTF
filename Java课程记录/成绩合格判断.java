import java.util.Scanner;//���빤����
public class �ɼ��ϸ��ж� {
	public static void main(String[] args) {//��ں���main
		
		Scanner input=new Scanner(System.in);//�����������
		System.out.println("��������ĳɼ�");
		float grade=input.nextFloat();//�ӿ���̨�������ֵ
		
		if(grade>=60) {//�����ж�
			System.out.println("�ɼ��ϸ�");
		}
		else {
			System.out.println("�ɼ����ϸ�");
		}
	}
}
