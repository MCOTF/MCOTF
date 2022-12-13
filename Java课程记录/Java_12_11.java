/*看了两眼java补考，顺便发下答案
cbdcb dbbca ccacd dcaca
abc ac acd bcd ab cd abc bd abcd abc
.java
数字 字母 美元符号 下划线
基本数据类型 引用数据类型
34题第一个空是前面那段，后边%JAVA_HOME%\jre\bin
javac
* */
public class Java_12_11 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i  =1;i<=1000;i++){
            if(i%2 != 0){
                sum+=i;
            }
        }
        System.out.println(sum);

        int x = 3;
        int y = 3;

        switch (x+3){
            case 6:
                y = 0;
            case 7:
                y = 1;
            default:
                y+=1;

        }
        System.out.println(y);
        char a = 'a';
        System.out.println(a+1);
        System.out.println(25%3);
    }
}
