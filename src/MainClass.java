class MainClass { 
    final static String company = "GFG"; 
    String name; 
    int rollno; 
public
    static void main(String[] args) 
    { 
        MainClass ob = new MainClass(); 
  
        // If we create a database for GFG org 
        // then the company name should be constant 
        // It can’t be changed by programmer. 
        ob.company = "Geeksforgeeks"; 
  
        ob.name = "Bishal"; 
        ob.rollno = 007; 
        System.out.println(ob.company); 
        System.out.println(ob.name); 
        System.out.println(ob.rollno); 
    } 
} 