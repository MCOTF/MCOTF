//Java API-String��
public class Java_12_16 {
    public static void main(String[] args) {
        //String[] split(String rengex)�����ݲ���regex��ԭ�����ַ����ָ�Ϊ���ɸ����ַ���
        String Str = "ʯ��ׯ-�人-������";
        System.out.print("��");
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
