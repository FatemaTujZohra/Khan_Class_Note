import java.util.Scanner;

public class Odd_Even_Number {
		int n, m;
	public void Find_Odd_Even_Number() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		m=n%2;
		if (m==1) {
		System.out.println("Number "+n+" is Odd ");	
			
		} else {
			
			System.out.println("Number "+n+" is Even ");
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_Even_Number obj=new Odd_Even_Number();
		
		obj.Find_Odd_Even_Number();
	}

}
