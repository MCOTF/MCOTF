import java.util.Scanner;
public class Java_10_21 {
    public static void main (String[] args){
        //投票系统
        //假设有两位委员
        int a = 0;
        int b = 0;
        //十票
        for (int picket= 1;picket<11;picket++){
            System.out.println("请输入委员编号：（0为委员a，1为委员b）。这是第"+picket+"次投票");
            Scanner input = new Scanner(System.in);//创建控制台输入对象
            int score = input.nextInt();//循环输入
            if (score == 0){
                a++;
                System.out.println("感谢您的投票");
            }
            else if (score == 1) {
                b++;
                System.out.println("感谢您的投票");
            }
            else {
                System.out.println("您输入的委员编号错误");
                picket--;//若输入错误，票数序号重置
            }
        }
        System.out.println("");
        if (a>b){
            System.out.println("委员a票更多");
        }
        else {
            System.out.println("委员b票更多");
        }

    }

}
