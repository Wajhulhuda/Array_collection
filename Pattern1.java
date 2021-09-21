package third.lecture;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String [] args) {
		
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number how much you want to design");
		int range = sc.nextInt();
		for (i=1 ; i<=range; i++) {
			
			for(j=range; j>i;j--) {
				
				System.out.print("* ");
			}
			System.out.print('\n');
		}
		
	} 

}
