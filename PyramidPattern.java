package third.lecture;

import java.util.Scanner;

public class PyramidPattern {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the pyramid..");
		int height = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= height; i++) {
			
			for(int j = height-i; j >= 1; j--) {
				
				System.out.print(" "+" ");
		
			}
			for(int k = 1; k <= (2*i-1); k++) {
				
				System.out.print("* ");
			}
				System.out.print("\n");
		}
	}

}
