package third.lecture;

public class SearchNumber {
	public static void main(String [] args) {
		int[] ar = {23,443,434,23,43,34,23,34,23,56};

		int n=56;
		boolean flag = false;
		for(int i=0; i<ar.length; i++) 
		{
			if(n==ar[i])
			{
				flag = true;
				break;
			}
		}
		if(flag==true) 
		{
			System.out.println("Number is present");
		}
		else 
		{
			System.out.println("Number is not present");
		}
		
		
	}

}
