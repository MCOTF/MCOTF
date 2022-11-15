public class Java_11_12 {
    public static void main(String[] args) {
        double sum = 0;
        int i = 1;
        while (sum < 12){
            sum = sum+(1.0/i+1.0);
            i++;
        }
        System.out.println(sum);
    }
}
