import java.util.Scanner;

/* 整体思路：
* 共有10位学生，每个学生拥有名字，id 和票数（票数刚开始都为0，故使用静态属性，好像int变量默认值就是0，应该也不需要，这一块存疑）
* 10位学生互相投票，取一个票数最多的当委员
* 循环10轮投票行为，学生输入自己的id后再选择要投给的学生id（建立控制台输入对象）
* 如果学生重复投票两次，则提示你已经投过票了（这里用校验码的思路，投过票的id是1，没投过的id是0）
* 若某位学生的票数>5则直接选出委员（跳出循环）
* 可人为控制退出（跳出循环）
*
* 个人感觉这题就难在需要输入学生编号上，如果只需要for循环学生编号就能省不少事
* */
class student_1027 extends Java_10_27{
    String name;//名字
    int number;//学生id（编号）
    int votes;//票数
    int[] votes2 = new int[9];//也是票数，方便排序（本来有个靠二维数组标准id和票数的想法，但不方便读取就暂时没弄）
    int checkCode;//校验码

    public student_1027(String name, int number,int checkCode) {
        this.name = name;
        this.number = number;
        this.votes = votes;
        this.checkCode = checkCode;
    }
    public void checkCode(){//验证机制
        if (this.checkCode == 1){
            j = 0;
        }
        else{
            this.checkCode++;
            System.out.println("");
        }
    }
    public void checkCode2(int j){

    }
    public void score(){//投票的函数
            this.votes++;
            //再写一个把票数放入数组的代码，但我笨比，不会搞
            System.out.println("目前"+this.name+"学生的票数为"+this.votes+"票");
    }
}
public class Java_10_27 {
    public static void main(String[] args) {
        //建立10位学生（0-9）
        student_1027 stu0 = new student_1027("0号",0,0);
        student_1027 stu1 = new student_1027("1号",1,0);
        student_1027 stu2 = new student_1027("2号",2,0);
        student_1027 stu3 = new student_1027("3号",3,0);
        student_1027 stu4 = new student_1027("4号",4,0);
        student_1027 stu5 = new student_1027("5号",5,0);
        student_1027 stu6 = new student_1027("6号",6,0);
        student_1027 stu7 = new student_1027("7号",7,0);
        student_1027 stu8 = new student_1027("8号",8,0);
        student_1027 stu9 = new student_1027("9号",9,0);
        for (int i = 0;i < 10;i++){//for10次自动退出

            //输入系统
            System.out.println("请输入你的学生编号");
            Scanner input = new Scanner(System.in);//创建控制台输入对象
            int mainScore1 = input.nextInt();
            switch (mainScore1) {
                case 0 -> stu0.checkCode();
                case 1 -> stu1.checkCode();
                case 2 -> stu2.checkCode();
                case 3 -> stu3.checkCode();
                case 4 -> stu4.checkCode();
                case 5 -> stu5.checkCode();
                case 6 -> stu6.checkCode();
                case 7 -> stu7.checkCode();
                case 8 -> stu8.checkCode();
                case 9 -> stu9.checkCode();
            }
            if(j == 1){
                System.out.println("你已经投过票了");
                j = 0;
                continue;
            }
            System.out.println("请输入要投给的学生编号");//对应number
            int mainScore2 = input.nextInt();

            //计分系统
            switch (mainScore2) {
                case 0 -> stu0.score();
                case 1 -> stu1.score();
                case 2 -> stu2.score();
                case 3 -> stu3.score();
                case 4 -> stu4.score();
                case 5 -> stu5.score();
                case 6 -> stu6.score();
                case 7 -> stu7.score();
                case 8 -> stu8.score();
                case 9 -> stu9.score();
            }

            //人为检测结束投票行为
//            System.out.println("是否人为结束投票");boolean over = input.nextBoolean();if (over){break;}//检测到人为结束就直接跳出，为了方便注释就写成一行了
        }


        //成绩处理
//        int max = getMax(数组);//利用数组取最高值机制，现在搞不出来暂时注释掉
        System.out.println("的得分最高");
    }
}






