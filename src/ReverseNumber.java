import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		long n=scn.nextLong();
		long k=0;
		long m=0;
		int p=String.valueOf(n).length();
		//System.out.println(p);
		for (int i=0;i<p;i++)
		{
			m=n%10;
		k=k*10+	m;
		n=n/10;
				
			
		}
		System.out.println(k);

	}

}
