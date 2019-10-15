package Self_Practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	String str="My name is Lutfor Rahman Khan";
	String str1;
	public void stringtest() {
		//str=str.replace('R', 'r');
		System.out.println(str.replace('R', 'r'));
		str1=str.replace('R', 'r');
		System.out.println(str1);
	}

	
	public static void listTest() {
		
		List<String> ls=new ArrayList<String>();
		
		ls.add("Md");
		ls.add("Lutfor");
		ls.add("Rahman");
		ls.add(2, "Khan");
		
		System.out.println(ls.get(1).contains("Lutfor"));
		if(ls.get(1).contains("Lutfor")) {System.out.println("Yes,He is the boss");}
		if(!ls.get(2).contains("Lutfor")) {System.out.println("No,He is not");}
		
		System.out.println(ls.get(2));
		
		System.out.println(ls);
		
	}
	public static void main(String[] args) {
		
		ListExample obj=new ListExample();
		//obj.stringtest();
		// TODO Auto-generated method stub
		listTest();
	}

}
