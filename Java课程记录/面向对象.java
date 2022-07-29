package com.MCOTF;

public class 面向对象 {
//	public static void main(String[] args) {
		
	//成员变量
		
		//添加类的属性与方法
	
		//String 姓名
		String Name;
		
		//int 年龄
		private int age;//私有(加密)状态
		/**
		 * 年龄私有化，无法被面向对象2访问
		 */
		
		//定义一个可以修改age值的方法
		//设置set和get方法(set+属性值)
		public void setAge(int sage) {//写:set方法
			if(sage>=0 && sage<=150) {//判断年龄是否正常
				age=sage;//sage→age
			}
			else {
				System.out.println("您输入的年龄有误！");
			}

		}
		public int getAge() {//读:get方法
			return age;
		}
		
		//String 学号
		String sno;
		//String 性别
		String ssex;
		//String 住址
		String addr;
		
	//成员方法
		
		//吃饭的方法
		public static void chiFan() {
			System.out.println("干饭了干饭了");
		}		
	}
//}
