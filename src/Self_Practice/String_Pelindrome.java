package Self_Practice;

import java.util.Scanner;

public class String_Pelindrome {
	
	public static String  strInput1;
	public static void stringReverse() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		strInput1=sc.nextLine();
		System.out.println("Input String: "+strInput1);
		int strSize=strInput1.length();
		char strArray2[]=new char[strSize];
		char[] strArray=strInput1.toCharArray();
		int j=strSize-1;
		for (int i=0; i<strSize; i++) {
			
			strArray2[i]=strArray[j];
			j--;
				
		}
		
		System.out.println(strArray2);
		//System.out.println(strArray2.toString());
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringReverse();

	}

}
