package all_collections;
import java.util.ArrayList;
import java.util.List;

public class ListOperation {
	
	public void listbasic() {
		
		List ls=new ArrayList();
		ls.add("Lutfor");
		ls.add("Rahman");
		System.out.println(ls);
		System.out.println(ls.get(0));
		System.out.println(ls.get(0).getClass());
		System.out.println(ls.get(0).equals("Lutfor"));
		System.out.println(ls.contains("Rahman"));
		//System.out.println(ls.);
	}
	
	

	public static void main(String[] args) {
		
		ListOperation objls= new ListOperation();
		objls.listbasic();
	}

}
