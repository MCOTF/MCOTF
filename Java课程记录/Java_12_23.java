import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Java_12_23 {
    public static void main(String[] args) {
        DateFormat date =DateFormat.getDateInstance(DateFormat.FULL);
        String time= date.format(new Date());
        System.out.println("DateFormat���FULL��ʽ��"+time);
        //yyyy-MM-dd��ʽ
        SimpleDateFormat date2=new SimpleDateFormat("yyyy-MM-dd");
        String time2=date2.format(new Date());
        System.out.println("SimpleDateFormat���yyyy-MM-dd��ʽ��"+time);
    }
}