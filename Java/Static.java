
import java.util.Scanner;

public class Static //-initializer -block
{
    static int B,H;
    static boolean flag;

    // Static initialization block
    static {

        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        if (B > 0 && H > 0) {
            flag = true; // Set flag to true if both B and H are positive
            
        }else{
                flag = false;
                System.out.println("java.lang.Exception: Breadth and Height must be positive");
            }
        }

        public static void main(String[] args) {

            // If flag is true, calculate and print the area
            if (flag){
                int area = B * H;
                System.out.println(area);
            }
        }

    }

