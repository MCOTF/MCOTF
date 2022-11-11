class Student{
    //变量
    String name;
    int age;
    String school="A大学";
    //方法:调用本student类属性
    public Student (String name,int age){
        this.name = name;
        this.age = age;
    }
    //info方法
    public void info () {
        System.out.println("姓名:"+this.name+"年龄:"+this.age+"学校:"+school);//this.name调用本类属性
    }
}
public class Java_10_21_371 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18); //创建student对象
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);
        stu1.info();
        stu2.info();
        stu3.info();
    }

}
