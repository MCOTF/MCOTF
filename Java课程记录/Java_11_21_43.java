//����4-3 ��ʵ�����
//Ҫ�󣺳�����
//����?�����ˣ������������
abstract class Animal{//������-����
    abstract void shut();//�����
    abstract void eat();//�����
}
class Dog extends Animal{//?
    void shut(){//��������
        System.out.println("?:��");
    }
    void shut1(){//�����ĵؽ�
        System.out.println("?:��(����)");
    }
    void shut2(){//������ؽ�
        System.out.println("?:��(����)");
    }
    void eat(){//����ʳ
        System.out.println("?:���ڳ�");
    }
}
abstract class Human{//������-��
    abstract void feeding();//Ͷι
}
class Master extends Human{//����
    void feeding() {//����Ͷι
        System.out.println("��");
    }
}
class MasterFamily extends Human{
    void feeding(){//����Ͷι

    }
}
class man extends Human{//İ����(�����������)
    void feeding() {//��Ͷι
        System.out.println("");
    }
}
public class Java_11_21_43 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        int a = 0;//����ֵ

        //���ķ�����Ϊ
        if(a == 0){//����Ͷι
            d1.eat();
            d1.shut();
            //��ϸ�ڿ��Լ�һ�������ķ���������֪��˼·�˾���������
        } else if (a == 1) {//����Ͷι
            d1.eat();
            d1.shut1();
        } else if (a == 2) {//İ����Ͷι
            d1.shut2();//İ����ι�ľͲ����ˣ��ʲ�ִ��eat����
        } else {//Ͷι����ķǷ�����
            //��ִ��
        }
    }
}
