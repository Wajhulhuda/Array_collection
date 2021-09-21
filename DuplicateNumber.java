package third.lecture;

public class DuplicateNumber {
		public static void main(String [] args) {
			
			int[] arr= {56,34,23,34,23,67,45,67};
			
			for (int i=0; i<arr.length;i++) {
				
				for(int j=i+1; j<arr.length; j++) {
					
					if(arr[i]==arr[j]) {
						
						System.out.println("Duplicate number is "+ arr[i]);
					}
				}
			}
		}
}
