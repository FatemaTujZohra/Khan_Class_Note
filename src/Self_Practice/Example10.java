package Self_Practice;
import java.io.*;
class ThrowExample10 { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNot Found Exception");
  } 
} 

public class Example10{ 
  public static void main(String args[]){ 
   try{ 
     ThrowExample10 obj=new ThrowExample10(); 
     obj.myMethod(2); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}