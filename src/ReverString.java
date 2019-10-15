
public class ReverString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am Muhammad Khan";
		//String str1;
		int p=str.length();
		char array[]=new char[p];
		for(int temp=0;temp<p;temp++) {
		char k=str.charAt(temp);
		array[p-1-temp]=k;
		}
		String test=String.valueOf(array);
		
		//String test=Character.toString(c)
		System.out.println(test);
	}

}
