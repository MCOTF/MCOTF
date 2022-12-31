//gc回收
class Person1230{
    public void crash(){
        System.out.println("对象将被作为垃圾回收");
    }
}
public class Java_12_30 {
    public static void main(String[] args) {
        //声明对象
        Person1230 c1 = new Person1230();
        Person1230 c2 = new Person1230();
        //重置对象，变为垃圾内容
        c1 = null;
        c2 = null;
        System.gc();//垃圾回收
        for (int i = 0;i< 1000000;i++){
            //延长程序运行时间
        }
    }
}