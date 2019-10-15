package all_collections;
import java.util.*;  
class MapExample3{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Amit");    
      map.put(101,"Vijay");    
      map.put(102,"Rahul");   
      //Returns a Set view of the mappings contained in this map        
      map.entrySet() 
      //Returns a sequential Stream with this collection as its source  
      //.stream() ; 
      //Sorted according to the provided Comparator  
      //.sorted(Map.Entry.comparingByKey())  
      //Performs an action for each element of this stream  
      .forEach(System.out::println); 
      
      System.out.println("Keys of the map are:");
      System.out.println(map.keySet());
      
      System.out.println("Values of the map are:");
      System.out.println(map.values());
      System.out.println(map.get(101));
      System.out.println(map.containsKey(101));
      System.out.println(map.containsValue("Rahul"));
 }  
}  