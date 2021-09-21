package third.lecture;

import java.util.Scanner;

public class PalindromString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		sc.close();
		String rev="";
		int length=str.length();
		 for(int i=length-1; i>=0;i--){
			 rev=rev+(str.charAt(i));
		 }
		 if(str.equals(rev)) {
			 System.out.println("Palindrom");
		 }
		 else {
			 System.out.println("Not palindrom");
		 }
		
		
		
	}

}
