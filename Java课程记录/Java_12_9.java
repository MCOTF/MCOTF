//�쳣java.lang.Throwable(�쳣��)

//��Ȼ��������쳣�������򲻻���ֹ
//try catch��ʹ����������
public class Java_12_9 {
    public static void main(String[] args) {
        try{//�����ſ��ܳ�������Ĵ����
            divide(1,0);//�������ִ����һ�к��������⣬Ȼ��ֹͣ����
            System.out.println("����");//��δ����
        }catch (Exception e){//����װ���쳣��e
            System.out.println("�������ϢΪ"+e.getMessage());//��ȡgetMessage
        }
        System.out.println("�����������");
    }
    public static int divide(int x,int y){
        int result;
        return result=x/y;
    }
}
