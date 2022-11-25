//多态
//比如睡觉：躺着睡，侧着睡，坐着睡（不同对象体现不同行为的现象）
//吃饭：先喝汤还是先吃面

//对象类型转换
//教师与学生：都属人，仅职位不同（向上转型）
class Animal1125{
    public void shout(){
        System.out.println("Animal的shout方法");
    }
}
class Dog1125 extends Animal1125{
    //重写shout方法
    public void shout() {
        System.out.println("汪汪");
    }
    public void eat(){
        System.out.println("吃骨头");
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
