package third.lecture;
 
class howCountString {
    public static void main(String[] args)
    {
          String input = "Waj Hul Huda Khan";
// 
//        StringBuilder input1 = new StringBuilder();
// 
//        input1.append(input);
// 
//        input1.reverse();
// 
//        System.out.println(input1);
          
          char[] str1 = input.toCharArray();
          for ( int i =  str1.length-1; i>=0; i--) {
        	  System.out.print(str1[i]);
        	  
          }
         
    	
    }
}