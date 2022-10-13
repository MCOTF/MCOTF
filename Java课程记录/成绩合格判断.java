import java.util.Scanner;//引入工具类
public class 成绩合格判断 {
	public static void main(String[] args) {//入口函数main
		
		Scanner input=new Scanner(System.in);//创建输入对象
		System.out.println("请输入你的成绩");
		float grade=input.nextFloat();//从控制台输入变量值
		
		if(grade>=60) {//条件判断
			System.out.println("成绩合格");
		}
		else {
			System.out.println("成绩不合格");
		}
	}
}
