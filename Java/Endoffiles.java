import java.util.Scanner;

//(EOF= End Of File)
public class Endoffiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1; // Start line numbering from 1

        // Loop until there is no more input (EOF)
        while (sc.hasNext()) {
            String line = sc.nextLine(); // Read the next line
            System.out.println(lineNumber + " " + line);
            lineNumber++; // Increment the line number
        }

        sc.close(); 
    }
}

