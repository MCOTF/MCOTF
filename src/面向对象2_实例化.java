package com.MCOTF;

public class 面向对象2_实例化 {
	public static void main(String[] args) {
		
		//创建对象名语法
		
		/**
		 * 等于号为赋值
		 * 故先执行new 类名，后执行类名 对象名
		 * */

		//类名 对象名=new 类名();
		面向对象 zs=new 面向对象(); //对象实例化(局部变量zs:张三)
		//zs现在为"面向对象"类型（）
		
		面向对象 ls=new 面向对象(); //创建第二个对象(局部变量ls:李四)
		
		//zs现在有name ，age ，sex等属性（来源于面向对象class）
		//对zs的各属性赋值
		
		zs.setAge(-20);//年龄为-20试错
		
		zs.Name="张三丰";
		zs.sno="202261001";
		zs.ssex="男";
// 		zs.addr="菏泽";//暂不赋值
				
		//输出(访问属性)：对象名.属性值
		System.out.println("姓名:"+zs.Name);
		System.out.println("学号:"+zs.sno);
		System.out.println("住址:"+zs.addr);//输出未赋值的属性，结果为String默认值null
		System.out.println("性别:"+zs.ssex);
		System.out.println("年龄:"+zs.getAge());//读取封装后的年龄
		
		//调用
		zs.chiFan();
		
	}
}
