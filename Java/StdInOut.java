import java.util.Scanner;

public class StdInOut {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}

