import java.util.Scanner;//���빤����
public class ��ż���ж�����ƽ���ж� {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����");
		int SZ=input.nextInt();
	
		if((SZ%4==0 & SZ%100!=0) | SZ%400==0) {//�����жϣ�ȡ��2�Ƿ�Ϊ0��
			//(year&4==0&&year%100!=0||year%400==0)
			System.out.println("���������");
		}
		else {
			System.out.println("�����ƽ��");
		}
	}
}
