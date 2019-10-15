// Override of static method 

public class OverrideStaticMethod { 
    public static void main(String[] args) 
    {
        Static_Method p = new Static_Method(); 
        // calling Parent's show() 
        //p.show(); 
        System.out.println(p.a);
        // cannot override Parent's show() 
    } 
} 
class Static_Method { 
     static int a=10;
    // static method 
    static void show() 
    { 
        System.out.println("Parent"); 
    } 
} 
  
// Parent inherit in Child class 
class Child extends Static_Method { 
  int a=60;
    // override show() of Parent 
    void show1() //static method can't be overriden
    { 
        System.out.println("Child"); 
    } 
} 
  
