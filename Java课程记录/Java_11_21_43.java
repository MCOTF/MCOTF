//����4-3 ��ʵ�����
//Ҫ�󣺳�����
//���󣺹������ˣ������������
abstract class Animal1121 {//������-����
    //tips��һ�������������ò���super
    abstract void shut();//�����
    abstract void eat();//�����
}
class Dog1121 extends Animal1121 {//��
    void shut(){//��������
        System.out.println("��:��");
    }
    void shut1(){//�����ĵؽ�
        System.out.println("��:��(����)");
    }
    void shut2(){//������ؽ�
        System.out.println("��:��(����)");
    }
    void eat(){//����ʳ
        System.out.println("��:���ڳ�");
    }
}
abstract class Human1121 {//������-��
    abstract void feeding();//Ͷι
}
class Master1121 extends Human1121 {//����
    void feeding() {//����Ͷι
        System.out.println("��");
    }
}
class MasterFamily1121 extends Human1121 {
    void feeding(){//����Ͷι
        System.out.println("MasterFamilyfeeding");
    }
}
class man1121 extends Human1121 {//İ����(�����������)
    void feeding() {//��Ͷι
        System.out.println("man-feeding");
    }
}
public class Java_11_21_43 {
    public static void main(String[] args) {
        Dog1121 d1 = new Dog1121();//���ɹ�-����
        int a = 0;//����ֵ

        //���ķ�����Ϊ
        if(a == 0){//����Ͷι
            d1.eat();
            d1.shut1();
            //��ϸ�ڿ��Լ�һ�������ķ���������֪��˼·�˾���������
        } else if (a == 1) {//����Ͷι
            d1.eat();
            d1.shut();
        } else if (a == 2) {//İ����Ͷι
            d1.shut2();//İ����ι�ľͲ����ˣ��ʲ�ִ��eat����
        } else {//Ͷι����ķǷ�����
            //��ִ��
        }
    }
}
