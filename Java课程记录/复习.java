public class 复习 {
	
	/**快速封装，快速构建
	 * 
	 * 
	 */
	
	//快速封装
	//1：属性的私有化
	private String name;
	private int age;
	private String no;
	private String major;
	private String sex;
	private String address;
	
	//get和set方法(get name、set name)
	//2：快速封装:alt+shift+s:（右键-源码-生成getter和setter）
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//this.作用：区分成员变量和局部变量
		//this.name属于成员变量,name属于局部变量
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	//年龄设定范围，如果超出0-150岁提示错误
	public void setAge(int age) {
		if (age>=0 && age<=150) {
			this.age = age;
		}
		else {
			System.out.println("年龄范围输入错误");
		}
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//快速构造（构造方法，构造函数，构造器）
	//右键-源码-使用字段生成构造函数
	//Generate Getters and Setters
	public 复习(String name, int age, String no) {
		super();//子父类，
		this.name = name;
		this.age = age;
		this.no = no;
	}
	//Generate Constructor using Fields
	public 复习(String major, String sex, String address) {
		this.major = major;
		this.sex = sex;
		this.address = address;
	}
	

	
	

}
