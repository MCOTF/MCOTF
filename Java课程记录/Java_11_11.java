//super调用父类构造方法
//final关键字
class Animal1111{
    private String name;
    private int age;

    public Animal1111(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String info(){
        return "父类名字"+this.name+"父类年龄"+this.age;//简化info操作
    }
}
class Dog1111 extends Animal1111{
    String color;
    //调用父类构造方法
    public Dog1111(String name, int age , String color) {
        super(name, age);//super只能放在第一行，而且只能出现一次
        this.color = color;
    }

    @Override
    public String info() {
        return super.info()+"子类颜色"+this.color;//简化info操作
    }
}
final class Final1111{//final关键字
    //此类不能作为父类
    final int a = 1;//第一次给a赋值后，a被锁死，只能等于1了，final变量不允许更改
//    a = 2;//再给a赋值会报错
    int b = 1;
}
public class Java_11_11 {
    public static void main(String[] args) {
        Dog1111 dog1 = new Dog1111("狗1",12,"red");
        System.out.println(dog1.info());//简化后的info需要走一个print，否则无结果
    }
}
