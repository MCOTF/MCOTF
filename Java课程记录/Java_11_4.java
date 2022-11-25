//11.04:类的继承关系
class Animal1104{
    void shut(){//被.shut和.supershut使用
        System.out.println("动物发生叫声");//被dog类重写
    }
}

class Dog1104 extends Animal1104 {//继承animal类
    void shut(){
        System.out.println("汪汪汪");
    }//方法重写
    void supershut(){
        super.shut();
    }//需要重新调用父类方法时使用
}

public class Java_11_4 {
    public static void main(String[] args) {
        Dog1104 dog1 = new Dog1104();
        dog1.shut();
        dog1.supershut();
    }
}
