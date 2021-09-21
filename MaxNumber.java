package third.lecture;

public class MaxNumber {
	public static void main (String [] args) {
		int[] arr= {86,55,34,54,65,34,34,35,45,54};
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
			
		}
		System.out.println("The maximum number is "+ max);
	}

}
