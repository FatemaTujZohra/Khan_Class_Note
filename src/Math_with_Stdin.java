import java.util.Scanner;

public class Math_with_Stdin {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
			
		
		int a,b,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		a=sc.nextInt();
		System.out.println("Enter the value of b ");
		b=sc.nextInt();
		
		z=a/b;
		System.out.println("Result of the operation  is "+z);
		sc.close();
	}

}