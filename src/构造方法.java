package com.MCOTF;

public class 构造方法 {
	private String name;
	private int age;
	
/**本质：给变量赋初始值
 * 1、构造方法必须和class 名一致
 * 2、return只能作为方法结束，故不能有任何返回值的声明
 */
//即使不写构造方法，系统也会提供一个无任何内容的构造方法
	
//	public 构造方法() {
//		System.out.println(123);
//	}
	
	//只包含姓名的构造方法
	public 构造方法(String sname) {
		name=sname;
	}
	//自定义一个包含姓名和年龄的构造方法
	//一个类名有多个构造方法的话，这种行为成为构造方法的重载
	public 构造方法(String sname,int sage) {
		name=sname;
		age=sage;
	}
	public void read() {
		System.out.println("名称"+name+",年龄"+age);
	}
	
}
