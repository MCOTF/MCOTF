//公共父类
class animal{
    //成员变量-属性
    String name;
    int age;
    int[][] grade = {{1,2},{2,3}};

    //animal类构造器
    public animal (String name,int age){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //行为
    public void hurt (){
        System.out.println("我草！");
    }
    public void eat(){
        System.out.println("正在吃");
    }
    public void introduction() {
        System.out.println("大家好！我是" + name + "我今年" + name + "岁了.");
    }
}

class dog extends animal{//继承
    public dog (String name,int age){
        super(name, age);
    }
    //行为
    public void shut (){
        System.out.println("汪");//多态-shut方法
    }
}
class cat extends animal{//继承
    public cat(String name,int age){
        super(name,age);
    }
    public void shut (){
        System.out.println("喵");//多态-shut方法
    }
}
class monkey {
    //构造方法
    public monkey(){

    }
}
public class Java_10_23{//10.23自习java
    public static void main(String[] args) {
        //类 对象 = new 类 （对象的属性，属性）；
        dog dog1 = new dog("dog1",1);
        dog dog2 = new dog("dog2",2);
        cat cat1 = new cat("cat1",1);
        dog1.hurt();//继承关系
        dog1.shut();//叫两声
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.grade);
        System.out.println(dog2.grade);

    }
}