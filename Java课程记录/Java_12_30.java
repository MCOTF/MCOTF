//gc����
class Person1230{
    public void crash(){
        System.out.println("���󽫱���Ϊ��������");
    }
}
public class Java_12_30 {
    public static void main(String[] args) {
        //��������
        Person1230 c1 = new Person1230();
        Person1230 c2 = new Person1230();
        //���ö��󣬱�Ϊ��������
        c1 = null;
        c2 = null;
        System.gc();//��������
        for (int i = 0;i< 1000000;i++){
            //�ӳ���������ʱ��
        }
    }
}