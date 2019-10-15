package string;
public class Example{  
   public static void main(String args[]){  
	//The first argument to this method is the delimiter
	String str=String.join("^","You","are","Awesome"); 
	String str1=String.join("-","You","are","Awesome");  
	System.out.println(str); 
	System.out.println(str1);  
   }
}