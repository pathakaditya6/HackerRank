import java.util.Scanner;

public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int currentSum = a;
            StringBuilder result = new StringBuilder();
            
            for(int m = 0; m < n; m++){
                currentSum += (int) Math.pow(2, m) * b;
                result.append(currentSum).append(" ");
            }
            System.out.println(result.toString().trim());
        }
        in.close();
    }
}
