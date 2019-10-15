class StaticMain { 
  
	static int a=10,b=20,c=30;
    // static method 
    public static int sum(int a, int b) 
    {    sub(a,b);
    	c=a+b;
    	c=50;
    	System.out.println(c);
        return c; 
        
    } 
    
    public static  int sub(int a, int b) 
    { 
        return a - b; 
    } 
    
    public   int mul(int a, int b) 
    {    sub(12,10);
        return a*b; 
    } 
} 
  
public class Main { 
    public static void main(String[] args) 
    { 
        int n = 3, m = 6; 
  
        // call the static method 
        int s = StaticMain.sum(n, m); 
  
        System.out.print("sum is = " + s); 
    } 
} 