import java.util.Scanner;
public class �ɼ��ж�{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int grade=input.nextInt();
	
		if(grade>100 || grade<0) {//�����ж�
			System.out.println("�����������������");
		}
		else if(grade<=100 && grade>=90) {
			System.out.println("a");
		}
		/**if (grade>100) {
			System.out.println("�����������������");
		}
		else if(grade<0) {
			System.out.println("�����������������");
		}*/
		else if(grade>=80) {
			System.out.println("b");
		}
		else if(grade>=70) {
			System.out.println("c");
		}
		else if(grade>=60) {
			System.out.println("d");
		}
		else  {
			System.out.println("e");
		}
	}
}
