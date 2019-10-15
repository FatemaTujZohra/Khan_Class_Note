package interface_abstract;

public class InterfaceTest implements Test {
     public void display()
     {
    	System.out.println("value of a="+a); 
    	 
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InterfaceTest().display();

	}

}

interface Test{
	int a=10;
	
}