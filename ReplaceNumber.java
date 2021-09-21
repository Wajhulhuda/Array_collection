package third.lecture;

public class ReplaceNumber {
	public static void main(String [] args) {
		int[] arr = {4,34,54,34,32,45,55,68,97};
		int num = 45;
		int replace=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.print(i);
				arr[i]=replace;
				break;
				
			}
		}
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ,");
		}
	}

}
