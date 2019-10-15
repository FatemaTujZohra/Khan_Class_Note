
public class Fabonacci {

	
	public static int fabonacci(int n) {
	int a=0, b=1, f=1;
	int k[]=new int[n];
	int count =0;
	for(int i=1;i<=n;i++) {
		
		f=a+b;
		a=b;
		b=f;
		k[count]=f;
		count++;
	}
	for(int temp:k)
	{System.out.println(temp);}
	return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fabonacci number"+fabonacci(7));
	}

}
