

// input and display element of SDA size 15  (SDA1).

import java.util.Scanner;

public class SDA1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[15];
		System.out.println("Enter 15 elements:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Element of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index: " + arr[i]);
		}
		sc.close();
	}

}

