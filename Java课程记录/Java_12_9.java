//�쳣java.lang.Throwable(�쳣��)

//��Ȼ��������쳣�������򲻻���ֹ
//try catch��ʹ���������Ƿ����쳣����������

//throws�׳��쳣������ʶ��ķ���

//����ʱ�쳣(checked�쳣)���﷨��ʽ��
//����ʱ�쳣(unchecked�쳣)��runtime Expection
//�Զ����쳣

//P107��ϰ�⣺4-9
public class Java_12_9 {
    public static void main(String[] args) {
        try{//�����ſ��ܳ�������Ĵ����
            divide(1,1);
            divide(1,0);//�������ִ����һ�к��������⣬Ȼ��ֹͣ����
            System.out.println("��try��ִ�е����");//��δ����
        }catch (Exception e){//��Ϊy=0��ִ��catch������ִ��
            System.out.println("�������ϢΪ"+e.getMessage());//��ȡgetMessage
            //�����д������java�Ż�ֹͣ
//            System.exit(0);//ֹͣjava�����
//            return;//��ת��finally

        }finally {
            System.out.println("��Ϊ��return��������main����");
        }
        System.out.println("�����������");//��δִ��

//        int result = divide(4,2);//���÷�������δ�趨�׳��쳣
//        System.out.println(result);
    }
    public static int divide(int x,int y)throws Exception{//������������ʹ��throws�ؼ����׳��쳣
        int result;
        return result=x/y;
    }
}
