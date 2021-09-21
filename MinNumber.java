package third.lecture;

public class MinNumber {
	public static void main(String [] args) {
		int[] arra = {34,654,43,24,234,43,42,22,24,245,535};
		int min=Integer.MAX_VALUE;
		for( int i=0; i<arra.length; i++) {
			if(min>arra[i]) {
				min=arra[i];
			}
		}
		System.out.println("The minimum value is "+ min);
	}

}
