public class Java_1_6 {
    public static void main(String[] args) {
        float f1[],f2[];
        f1 = new  float[10];
        f2 = f1;
        System.out.println(f2[0]);
        int x =3;
        System.out.println(++x);
        x = 3;
        System.out.println(x++);
        System.out.println(x);
        try{
            x =div(1,2);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(x);
        x = 7;
        System.out.println((x++)/2);
    }
    public  static int div(int a,int b){
        return a/b;
    }
}
