public class 数组 {
	public static void main(String[] args) {
/**1.声明2.创建3.赋值4.访问
		*1.数据类型 [] 数组名
		*2.数组名=new 数据类型[长度]
		*/
		
		int []age;//声明(告诉内存空间)
		//创建数组但不赋值的话为默认值，0-99个下标对应的值都为0
		age =new int[100];//创建(分配内存空间)new 数据类型[]长度
		
		//通过数组下标读取对应的值
		System.out.println(age[0]);//读取第一个元素
		System.out.println(age[1]);//读取第二个元素
	
		//String为class类，首字母要大写
		String []name=new String[100];//声明/创建合并
		System.out.println(name[0]);//null(引用数据类型默认值为)
		//动态赋值
		name[1]="张三";//第二个元素赋值
		name[2]="李四";//第三个元素赋值
		
		//静态赋值
		//静态初始化不要加长度int[]，否则会报错
		int[]age1=new int[] {18,19,20,21,10,22};//int[]元素内有六个，
		//int age1={18,19,20,21,10,22}
		System.out.println(age1[6]);//报错（数组下标越界）
		
//		arr=null;
//		System.out.println(arr[0]);//报错（空指针异常）
	}
}
