package Class_Materials;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Hellow";
		String str2="World";
		
		str1=str2+str1;
		str2=str1.substring(str1.length()-str2.length()-1, str1.length());
		System.out.println("value of str2 "+str2);
		str1=str1.substring(0,str1.length()-str2.length());
		System.out.println("Value of str1 "+str1);
		
		
		
		
		
		

	}

}
