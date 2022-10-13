import java.util.Scanner;
public class 成绩判断{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int grade=input.nextInt();
	
		if(grade>100 || grade<0) {//条件判断
			System.out.println("输入错误，请重新输入");
		}
		else if(grade<=100 && grade>=90) {
			System.out.println("a");
		}
		/**if (grade>100) {
			System.out.println("输入错误，请重新输入");
		}
		else if(grade<0) {
			System.out.println("输入错误，请重新输入");
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
