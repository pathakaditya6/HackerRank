import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            try {
                long n = sc.nextLong(); // Read the number
                
                System.out.println(n + " can be fitted in:");
                
                // Check for each type
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Catch numbers that are larger than Long.MAX_VALUE or smaller than Long.MIN_VALUE
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        
        sc.close(); 
    }
}
