public class ��ϰ {
	
	/**���ٷ�װ�����ٹ���
	 * 
	 * 
	 */
	
	//���ٷ�װ
	//1�����Ե�˽�л�
	private String name;
	private int age;
	private String no;
	private String major;
	private String sex;
	private String address;
	
	//get��set����(get name��set name)
	//2�����ٷ�װ:alt+shift+s:���Ҽ�-Դ��-����getter��setter��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//this.���ã����ֳ�Ա�����;ֲ�����
		//this.name���ڳ�Ա����,name���ھֲ�����
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	//�����趨��Χ���������0-150����ʾ����
	public void setAge(int age) {
		if (age>=0 && age<=150) {
			this.age = age;
		}
		else {
			System.out.println("���䷶Χ�������");
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
	
	//���ٹ��죨���췽�������캯������������
	//�Ҽ�-Դ��-ʹ���ֶ����ɹ��캯��
	//Generate Getters and Setters
	public ��ϰ(String name, int age, String no) {
		super();//�Ӹ��࣬
		this.name = name;
		this.age = age;
		this.no = no;
	}
	//Generate Constructor using Fields
	public ��ϰ(String major, String sex, String address) {
		this.major = major;
		this.sex = sex;
		this.address = address;
	}
	

	
	

}
