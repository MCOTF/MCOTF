/*计算机一班石敬毅
一、
1.面向对象 SUN
2.Java SE、Java EE、Java ME
3.跨平台性 面向对象 多线程
4.JDK
5.bin
6.class
7.单行注释 多行注释 文档注释
8.数据类型 引用数据
9.& && | ||
10.一组类型相同的数据的集合 0
11.封装 继承 多态
12.class
13.public private protected
14.static
15.private

二、
1.C 2.ABCD 3.D 4.C 5.B 6.D 7.B 8.D 9.B 10.B 11.A 12.B 13.C

三、
1.Java语言的特点有简单性、跨平台性、面向对象、安全性，支持多线程和分布式。
2.break语句会让整个循环终止，如果在嵌套循环下只能跳出内层循环；continue则会结束当前循环，并执行下一次循环。区别在于break会让循环终止不再循环，而continue会继续执行下一次循环。
3.封装：将对象的状态信息隐藏在对象内部，保护代码不允许外界任意访问，提高代码&程序的安全性；继承：类似于生物分类一样，dog类与cat类都隶属与animal类。为了提升代码的复用性，继承可以对原有类的功能进行扩展；多态：依靠方法的重载与重写特性，使同一方法能表达出不同内容。
4.在类中定义的变量为成员变量；在方法内定义的变量为局部变量，在方法执行完毕后就销毁。
四、*/

//计1S，内容已上传到gitee中（https://gitee.com/MCOTF/course-code/blob/master/Java%E8%AF%BE%E7%A8%8B%E8%AE%B0%E5%BD%95/Java_10_28.java）
class student1028{

    //题目有get部分，并且并不需要继承，故成员变量使用private和final关键字标注
    private final String sNO;//学号
    private final String sName;//姓名
    private final String sSex;//性别
    private final int sAge;//年龄
    private final double sJava;//java成绩

    //学生类构造器，也可以用setter一个一个写，但太麻烦了
    public student1028(String sNO, String sName, String sSex, int sAge, double sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    //getter方法
    public String getsNO() {
//        System.out.printf("学号："+this.sNO);
        return sNO;
    }
    public String getsName() {
//        System.out.printf("姓名："+this.sName);
        return sName;
    }
    public String getsSex() {
//        System.out.printf("性别："+this.sSex);
        return sSex;
    }
    public int getsAge() {
//        System.out.printf("年龄："+this.sAge);
        return sAge;
    }
    public double getsJava() {
        //这里不写soutf，方便数组复用代码，信息仍然可以从声明的print输出
        return sJava;
    }

    //学生信息输出
    public void print(){
//        System.out.println("学号："+getsNO()+"，姓名："+getsName()+"，性别："+getsSex()+"，年龄："+getsAge()+"，Java课程成绩："+this.sJava);
        System.out.println("学号："+this.sNO+"，姓名："+this.sName+"，性别："+this.sSex+"，年龄："+this.sAge+"，Java课程成绩："+this.sJava);
    }
}
public class Java_10_28 {

    //取java成绩最大值
    public static double getMax(double[] arr) {
        double max = arr[0];
        for(int i = 1;i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //取java成绩最小值
    public static double getMin(double[] arr) {
        double min= arr[0];
        for(int i = 1;i < arr.length; i++) {
            if (min> arr[i]) {
                min= arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        //生成5位学生对象，也可以用setter方法一个一个写，为了方便查看结果这里按照1-5的顺序全写出来了
        student1028 stu1 = new student1028("01", "学生1", "男", 21, 90.1);
        student1028 stu2 = new student1028("02", "学生2", "女", 22, 90.2);
        student1028 stu3 = new student1028("03", "学生3", "男", 23, 90.3);
        student1028 stu4 = new student1028("04", "学生4", "女", 24, 90.4);
        student1028 stu5 = new student1028("05", "学生5", "男", 25, 90.5);

        //信息输出
        stu1.print();
        stu2.print();
        stu3.print();
        stu4.print();
        stu5.print();

        //把成绩放入数组中，题目不需要确定具体学生的最大值与最小值，故仅放入5位学生的java成绩
        double[] array = {stu1.getsJava(), stu2.getsJava(), stu3.getsJava(), stu4.getsJava(), stu5.getsJava()};

        double max = getMax(array);
        double min = getMin(array);

        //循环取平均值，顺便把最大值和最小值一起输出
        double sum = 0;
        for (int i = 0;i <= array.length;i++) {
            if (i == array.length) {
                //取平均值
                sum = sum/array.length;
                System.out.println("平均值为"+sum);
                System.out.println("最大值为"+max);
                System.out.println("最小值为"+min);
            }
            else {
                sum+= array[i];
            }
        }
    }
}
/*
⠀⠀⠀⣀⣤⣤⣶⣾⣿⠉⠉⠉⠉⢻⣶⣦⣤⣀
⡤⠒⠁⠀⢼⣿⣿⣿⣿⡆⠀⠀⠀⢸⣿⣿⣿⣧⠈⠓⠦⣄
⠀⠀⠀⠀⠸⠿⠛⠛⠋⣰⣿⣿⣿⣿⠉⠛⠛⠛⠀⠀⠀⠀⠀⠉⠲⢤
⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠈⠁⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸
⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣶⣾⣶⣿⢿⣧⣀⠀⠀⠀⠀⠀⠀⠀⢀⠃
⠀⠀⠀⣀⣤⣶⣿⣿⠟⠘⣿⣿⣿⡏⠀⠻⣿⣻⢿⣦⣀⠀⠀⢀⠋
⣀⣴⣿⣿⣿⣿⣿⠉⠀⠀⢿⣿⣿⠀⠀⠉⢻⣿⣿⣿⣿⡿⢀⠋
⣿⣿⣿⣿⣿⣥⠃⠀⡆⠀⠘⠛⠀⠀⠀⣷⠀⣧⢿⣿⣿⣇⡏
⣿⣿⣿⣿⣿⣿⠀⠀⣿⠀⠀⠀⠀⠀⠀⢸⠀⠀⢿⣿⣿⣿⡀
⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣦⡀
⠉⢿⣿⣿⣿⣧⠀⠀⠀⠀⢰⠀⠉⠀⠀⠀⣀⣴⣿⣿⣿⡟⠉⠉⠉⠉
⠤⣀⢿⣿⣿⣿⠛⠻⠿⣶⠚⠉⢹⣿⡿⠉⣀⣾⣿⡿⠁
⠀⠀⠙⢭⡿⣿⣆⠀⠀⠀⠳⡀⣰⠁⣴⠟⠉⠉⠻⡀
⠀⠀⠀⠀⠀⡹⠿⣤⣤⣀⣤⣾⣿⣶⡇⠀⠀⠀⠀⠈⡄
*/