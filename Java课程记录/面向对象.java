package com.MCOTF;

public class ������� {
//	public static void main(String[] args) {
		
	//��Ա����
		
		//�����������뷽��
	
		//String ����
		String Name;
		
		//int ����
		private int age;//˽��(����)״̬
		/**
		 * ����˽�л����޷����������2����
		 */
		
		//����һ�������޸�ageֵ�ķ���
		//����set��get����(set+����ֵ)
		public void setAge(int sage) {//д:set����
			if(sage>=0 && sage<=150) {//�ж������Ƿ�����
				age=sage;//sage��age
			}
			else {
				System.out.println("���������������");
			}

		}
		public int getAge() {//��:get����
			return age;
		}
		
		//String ѧ��
		String sno;
		//String �Ա�
		String ssex;
		//String סַ
		String addr;
		
	//��Ա����
		
		//�Է��ķ���
		public static void chiFan() {
			System.out.println("�ɷ��˸ɷ���");
		}		
	}
//}
