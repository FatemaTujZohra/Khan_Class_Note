
public class Stringswaping extends StringTestExercise {

	public static void main(String[] args) {
		
		
		String A="ab", B="ba";
		//Swap a from B to A and b from A to B
		
		char k= A.charAt(1);
		String k1=Character.toString(k);
		System.out.println(k);
		//A.replace("b", "k");
		//System.out.println(A);
		
		int position=1;
		    StringBuilder sb = new StringBuilder(A);
		    //sb.insert(position, k1);
		    
		   // sb.insert(1, k);
		   // sb.replace(1, 1, k1);
		    // sb.toString();
		    sb.insert(1, k1);
		     
		     System.out.println(sb);
		

	}

}
