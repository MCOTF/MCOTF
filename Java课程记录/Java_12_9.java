//异常java.lang.Throwable(异常类)

//虽然程序出现异常，但程序不会终止
//try catch会使程序无论是否发生异常都会继续完成

//throws抛出异常，被标识后的方法

//编译时异常(checked异常)：语法格式，
//运行时异常(unchecked异常)：runtime Expection
//自定义异常

//P107练习题：4-9
public class Java_12_9 {
    public static void main(String[] args) {
        try{//用来放可能出现问题的代码块
            divide(1,1);
            divide(1,0);//正常情况执行这一行后会出现问题，然后停止运行
            System.out.println("在try中执行的语句");//并未运行
        }catch (Exception e){//因为y=0故执行catch，否则不执行
            System.out.println("捕获的信息为"+e.getMessage());//获取getMessage
            //除非有此情况，java才会停止
//            System.exit(0);//停止java虚拟机
//            return;//跳转到finally

        }finally {
            System.out.println("因为有return，则跳出main方法");
        }
        System.out.println("程序继续运行");//并未执行

//        int result = divide(4,2);//调用方法，但未设定抛出异常
//        System.out.println(result);
    }
    public static int divide(int x,int y)throws Exception{//除法方法，并使用throws关键字抛出异常
        int result;
        return result=x/y;
    }
}
