//案例4-3 多彩的声音
//要求：抽象类
//对象：狗，主人，主人以外的人
abstract class Animal1121 {//抽象类-动物
    //tips：一般抽象类的子类用不到super
    abstract void shut();//动物叫
    abstract void eat();//动物吃
}
class Dog1121 extends Animal1121 {//狗
    void shut(){//狗正常叫
        System.out.println("狗:汪");
    }
    void shut1(){//狗开心地叫
        System.out.println("狗:汪(开心)");
    }
    void shut2(){//狗警惕地叫
        System.out.println("狗:汪(警惕)");
    }
    void eat(){//狗进食
        System.out.println("狗:正在吃");
    }
}
abstract class Human1121 {//抽象类-人
    abstract void feeding();//投喂
}
class Master1121 extends Human1121 {//主人
    void feeding() {//主人投喂
        System.out.println("吃");
    }
}
class MasterFamily1121 extends Human1121 {
    void feeding(){//家人投喂
        System.out.println("MasterFamilyfeeding");
    }
}
class man1121 extends Human1121 {//陌生人(主人以外的人)
    void feeding() {//你投喂
        System.out.println("man-feeding");
    }
}
public class Java_11_21_43 {
    public static void main(String[] args) {
        Dog1121 d1 = new Dog1121();//生成狗-对象
        int a = 0;//调试值

        //狗的分析行为
        if(a == 0){//主人投喂
            d1.eat();
            d1.shut1();
            //再细节可以加一个欢跳的方法，不过知道思路了就懒得做了
        } else if (a == 1) {//家人投喂
            d1.eat();
            d1.shut();
        } else if (a == 2) {//陌生人投喂
            d1.shut2();//陌生人喂的就不吃了，故不执行eat方法
        } else {//投喂以外的非法操作
            //不执行
        }
    }
}
