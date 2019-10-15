package Class_Materials;

public class Methods {
	
	
	public void test1( int a)
	{
		System.out.println("Value of int a ="+a);
		}
	
	public int test1( int a, int b)
	{
		//System.out.println("Value of Char a ="+a);
		int z;
		z=a+b;
		return 0;
			}
	
	
	public static void main(String[] args) {
		Methods obj1=new Methods();
		obj1.test1(10);
		//obj1.test1(20,30);
		int k;
		k=obj1.test1(20,30);
		System.out.println("Value of k ="+ k);
		
		
		//obj1.test1(20,50.5f);
		//obj1.test1(10.5f,20);
	}

}
