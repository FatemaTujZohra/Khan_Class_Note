package Class_Materials;

public class Calculator_of_Data {
	
	int a=90, b=20, z;
	
	
	 public void addition()
	 {
		 
		z=a+b;
		System.out.println("Value of a+b by Dadar clculator"+z);
	 }
	
	
}

class Calculator_of_Baba extends Calculator_of_Data{
	int a=90, b=20,z;
	void subtruction ()
	{
		z=a-b;
		System.out.println("Value of a-b by Baba's clculator"+z);	
	}
}

class calculator_of_Mine extends Calculator_of_Baba{
	
	int a=10,b=4,z;
	int  Multiplication()
	 {
		z=a*b;
		
		return z;
		 
	 }
}
