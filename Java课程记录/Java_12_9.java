//异常java.lang.Throwable(异常类)

//虽然程序出现异常，但程序不会终止
//try catch会使程序继续完成
public class Java_12_9 {
    public static void main(String[] args) {
        try{//用来放可能出现问题的代码块
            divide(1,0);//正常情况执行这一行后会出现问题，然后停止运行
            System.out.println("测试");//并未运行
        }catch (Exception e){//被封装的异常类e
            System.out.println("捕获的信息为"+e.getMessage());//获取getMessage
        }
        System.out.println("程序继续运行");
    }
    public static int divide(int x,int y){
        int result;
        return result=x/y;
    }
}
