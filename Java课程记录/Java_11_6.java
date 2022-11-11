//abstract抽象类自习
abstract class abstract1106{

    //面向方法-抽象类
    int a;
    String b;
    Boolean c;
    public abstract void read();
}
class abs1 extends abstract1106{
    public void read(){
        System.out.println("被抽象类继承的方法");
    }
}
public class Java_11_6 {
    public static void main(String[] args) {
        //这种是错误的例子
//        abstract1106 a1 = new abstract1106();//抽象类不能被实例化
        //这种是正确的例子
        abs1 a1 = new abs1();//能被……继承用
        a1.read();//仍然可以调用父类的方法与子类的方法
    }
}
