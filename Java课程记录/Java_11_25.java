//��̬
//����˯��������˯������˯������˯����ͬ�������ֲ�ͬ��Ϊ������
//�Է����Ⱥ��������ȳ���

//��������ת��
//��ʦ��ѧ���������ˣ���ְλ��ͬ������ת�ͣ�
class Animal1125{
    public void shout(){
        System.out.println("Animal��shout����");
    }
}
class Dog1125 extends Animal1125{
    //��дshout����
    public void shout() {
        System.out.println("����");
    }
    public void eat(){
        System.out.println("�Թ�ͷ");
    }
}
public class Java_11_25 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Animal an = dog;
        Animal1125 an = new Dog1125();
        Dog1125 dog = (Dog1125)an;
//        an.shout();
        dog.shout();
        dog.eat();
    }
}
