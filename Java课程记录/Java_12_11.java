/*��������java������˳�㷢�´�
cbdcb dbbca ccacd dcaca
abc ac acd bcd ab cd abc bd abcd abc
.java
���� ��ĸ ��Ԫ���� �»���
������������ ������������
34���һ������ǰ���ǶΣ����%JAVA_HOME%\jre\bin
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
