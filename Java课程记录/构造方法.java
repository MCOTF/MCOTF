package com.MCOTF;

public class ���췽�� {
	private String name;
	private int age;
	
/**���ʣ�����������ʼֵ
 * 1�����췽�������class ��һ��
 * 2��returnֻ����Ϊ�����������ʲ������κη���ֵ������
 */
//��ʹ��д���췽����ϵͳҲ���ṩһ�����κ����ݵĹ��췽��
	
//	public ���췽��() {
//		System.out.println(123);
//	}
	
	//ֻ���������Ĺ��췽��
	public ���췽��(String sname) {
		name=sname;
	}
	//�Զ���һ����������������Ĺ��췽��
	//һ�������ж�����췽���Ļ���������Ϊ��Ϊ���췽��������
	public ���췽��(String sname,int sage) {
		name=sname;
		age=sage;
	}
	public void read() {
		System.out.println("����"+name+",����"+age);
	}
	
}
