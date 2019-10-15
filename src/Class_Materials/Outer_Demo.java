package Class_Materials;

public class Outer_Demo {
	
	 
	// private variable of the outer class
	   private int num = 175;  
	   
	   // inner class
	   public class Inner_Demo {
		  // z=a+b;
	      public int getNum() {
	         System.out.println("This is the getnum method of the inner class");
	         return num;
	      }
	   }
	   
	   
	}

	