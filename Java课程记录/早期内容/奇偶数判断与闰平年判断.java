import java.util.Scanner;//引入工具类
public class 奇偶数判断与闰平年判断 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int SZ=input.nextInt();
	
		if((SZ%4==0 & SZ%100!=0) | SZ%400==0) {//条件判断（取余2是否为0）
			//(year&4==0&&year%100!=0||year%400==0)
			System.out.println("结果是闰年");
		}
		else {
			System.out.println("结果是平年");
		}
	}
}
