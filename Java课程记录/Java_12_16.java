//Java API-String类
public class Java_12_16 {
    public static void main(String[] args) {
        //String[] split(String rengex)：根据参数regex将原来的字符串分割为若干个子字符串
        String Str = "石家庄-武汉-哈尔滨";
        System.out.print("：");
        String[] strArray = Str.split("-");
        for (int i = 0;i < strArray.length ; i++){
            if (i != strArray.length -1){
                System.out.print(strArray[i] + ",");
            }else {
                System.out.print(strArray[i]);
            }
        }
    }
}
