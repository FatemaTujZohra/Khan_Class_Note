package all_collections;
import java.util.*;
public class InitializationExample2 {
   public static void main(String args[]) {
	   ArrayList<String> cities = new ArrayList<String>(){{
		   add("Delhi");
		   add("Agra");
		   add("Chennai");
		   }};
	  System.out.println("Content of Array list cities:"+cities);
   }
}