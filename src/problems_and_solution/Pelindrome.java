package problems_and_solution;

public class Pelindrome {
	
	public void pelindrometest_div_method(String str) {
		boolean flag=false;
		int strlength=str.length();
		int I=strlength/2-1;
		int J=I;
		
		char[] strArray=str.toCharArray();
		for (int i=0; i<I;i++) {
			if (strArray[I]!=strArray[J]) {
				flag=true;			
			}
			//System.out.println(I+"="+strArray[I]);
			//System.out.println(J+"="+strArray[J]);
			I--;
			
			J++;		
		}
		if (flag==true) {System.out.println(str+" String is not pelindrome");}
		else System.out.println(str+" Sring is pelindrome");
		
	}

	public static void main(String[] args) {
		
		Pelindrome obj1=new Pelindrome();
		obj1.pelindrometest_div_method("abccba");

	}

}
