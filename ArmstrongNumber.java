package third.lecture;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
	
	public static void main(String [] args) {
		
		int num,count=0,last=0,temp,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = sc.nextInt();
		sc.close();
		
		temp=num;
		
		while(temp>0) {
			temp= temp/10;
			count++;
		}
		
		temp=num;
		
		while(temp>0) {
			last=temp%10;
			sum += (Math.pow(last, count));
			temp=temp/10;
		}
		
		if(num==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
			
		}
	}

}
