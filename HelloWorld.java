import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int count = Math.floorDiv(num, 12);
        for (int i = 1; i <=num; i++) {
            if(i%3 == 0 && i%4 ==0){
                sum+=i;
            }
            else{
                continue;
            }
        }
        System.out.println(sum/count);
        in.close();
    }                   
}