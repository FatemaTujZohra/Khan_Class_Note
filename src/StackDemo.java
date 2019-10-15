// Java code to illustrate 
// Stack containsAll() 
  
import java.util.*; 
  
class StackDemo { 
    public static void main(String args[]) 
    { 
  
        // Creating an empty stack 
        Stack<String> 
            stack = new Stack<String>(); 
  
        // Use add() method to 
        // add elements in the stack 
        stack.add("Geeks"); 
        stack.add("for"); 
        stack.add("Geeks"); 
        stack.add("10"); 
        stack.add("20"); 
  
        // prints the stack 
        System.out.println("Stack 1: "
                           + stack.get(4)); 
  
        // Creating another empty stack 
        Stack<String> 
            stack2 = new Stack<String>(); 
  
        // Use add() method to 
        // add elements in the stack 
        stack2.add("Geeks"); 
        stack2.add("for"); 
        stack2.add("Geeks"); 
        stack2.add("10"); 
        stack2.add("20"); 
  
        // prints the stack 
        System.out.println("Stack 2: "
                           + stack2); 
  
        // Check if the stack 
        // contains same elements 
        System.out.println("\nDoes stack 1 contains stack 2: "
                           + stack.containsAll(stack2)); 
    } 
} 