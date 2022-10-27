import java.util.Scanner;

class Student_1026 {
    //委员
    String name;
    int ticket = 0;

    public Student_1026(String name) {//student类构造器
        this.name = name;
    }
}
public class Java_10_26 {
    public static void main(String[] args) {
        Student_1026 stu1 = new Student_1026("委员1");
        Student_1026 stu2 = new Student_1026("委员2");
        for (int picket = 0;picket < 10;picket++) {
            System.out.println("目前" + stu1.name + "的票数为" + stu1.ticket);
            System.out.println("目前" + stu2.name + "的票数为" + stu2.ticket);
            System.out.println("请选择你要投票的对象(委员1请输入1，委员2请输入2)，这是第"+picket+"次投票");
            Scanner input = new Scanner(System.in);
            int score = input.nextInt();
            if (score == 1){
                stu1.ticket++;
                System.out.println("感谢您的投票");
            }
            else if (score == 2) {
                stu2.ticket++;
                System.out.println("感谢您的投票");
            }
            else {
                System.out.println("您输入的委员编号错误");
                picket--;//若输入错误，票数序号重置
            }
        }
        if (stu1.ticket == stu2.ticket){
            System.out.println("两位委员票数相同，均为"+stu1.ticket+"票");//选stu2也彳亍，因为这俩票数一样了
        }
        else if (stu1.ticket > stu2.ticket) {
            System.out.println(stu1.name+"票数更多，共有"+stu1.ticket+"票");
        }
        else {
            System.out.println(stu2.name+"票数更多，共有"+stu2.ticket+"票");
        }
    }
}
