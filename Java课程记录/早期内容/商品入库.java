import java.util.Scanner;
public class ��Ʒ��� {
	public static void main(String[] args) {
		String huaweiBrand = "��Ϊ";
		double huaweiSize = 5.5;
		double huaweiPrince = 3688.88;
		String huaweiConfig = "6+128G";
		System.out.println("Ʒ���ͺ�"+huaweiBrand);
		System.out.println("�ߴ�"+huaweiSize);
		System.out.println("�۸�"+huaweiPrince);
		System.out.println("����"+huaweiConfig);
		//ͨ������̨ʵ�ֿ�������
		Scanner input = new Scanner (System.in);
		System.out.println("�����뻪Ϊ��Ʒ������");
		int huaweiCount = input.nextInt();
		System.out.println("��滪Ϊ���ܼۣ�"+huaweiPrince*huaweiCount);
		String xiaomiBrand = "С��";
		double xiaomiSize = 5.0;
		double xiaomiPrince = 2988.88;
		String xiaomiConfig = "4+64G";
		System.out.println("Ʒ���ͺ�"+xiaomiBrand);
		System.out.println("�ߴ�"+xiaomiSize);
		System.out.println("�۸�"+xiaomiPrince);
		System.out.println("����"+xiaomiConfig);
		System.out.println("������С����Ʒ������");
		int xiaomiCount = input.nextInt();
		System.out.println("���С�׵��ܼۣ�"+xiaomiPrince*xiaomiCount);
		System.out.println("------------����嵥--------------");
		System.out.println("Ʒ���ͺ�   �ߴ�    �۸�       ����");
		System.out.println(huaweiBrand+"     "+huaweiSize+"    "+huaweiPrince+"    "+huaweiConfig);
		System.out.print(xiaomiBrand+"     ");
		System.out.print(xiaomiSize+"    ");
		System.out.print(xiaomiPrince+"    ");
		System.out.println(xiaomiConfig);
		System.out.println("------------����嵥--------------");
		System.out.println("�ܿ��"+(int)(huaweiCount+xiaomiCount));
		System.out.println("����ܼ�"+(double)(huaweiPrince+xiaomiPrince)+"$");
		}
}
