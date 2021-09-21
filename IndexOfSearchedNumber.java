package third.lecture;

public class IndexOfSearchedNumber {
	public static void main(String [] args) {
		int[] ar = {23,443,434,23,43,34,23,34,23,56};

		int n=56;
		boolean flag = false;
		int index = -1;
		for(int i=0; i<ar.length; i++) 
		{
			if(n==ar[i])
			{
				flag = true;
				index=i;
				break;
			}
		}
		if(flag==true) 
		{
			System.out.println("Number is present at "+ index +" index.");
		}
		else 
		{
			System.out.println("Number is not present");
		}
		
		
	}

}
