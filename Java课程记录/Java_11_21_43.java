//案例4-3 多彩的声音
//要求：抽象类
//对象：?，主人，主人以外的人
abstract class Animal{//抽象类-动物
    abstract void shut();//动物叫
    abstract void eat();//动物吃
}
class Dog extends Animal{//?
    void shut(){//狗正常叫
        System.out.println("?:汪");
    }
    void shut1(){//狗开心地叫
        System.out.println("?:汪(开心)");
    }
    void shut2(){//狗警惕地叫
        System.out.println("?:汪(警惕)");
    }
    void eat(){//狗进食
        System.out.println("?:正在吃");
    }
}
abstract class Human{//抽象类-人
    abstract void feeding();//投喂
}
class Master extends Human{//主人
    void feeding() {//主人投喂
        System.out.println("吃");
    }
}
class MasterFamily extends Human{
    void feeding(){//家人投喂

    }
}
class man extends Human{//陌生人(主人以外的人)
    void feeding() {//你投喂
        System.out.println("");
    }
}
public class Java_11_21_43 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        int a = 0;//调试值

        //狗的分析行为
        if(a == 0){//主人投喂
            d1.eat();
            d1.shut();
            //再细节可以加一个欢跳的方法，不过知道思路了就懒得做了
        } else if (a == 1) {//家人投喂
            d1.eat();
            d1.shut1();
        } else if (a == 2) {//陌生人投喂
            d1.shut2();//陌生人喂的就不吃了，故不执行eat方法
        } else {//投喂以外的非法操作
            //不执行
        }
    }
}
