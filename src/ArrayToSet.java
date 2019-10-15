import java.util.HashMap;
import java.util.Map;

public class ArrayToSet {

	public void convertArrayToSet1(int[] inputArray) {
		
		System.out.println("Khan");
		//inputArray.toString();
		int arrysize=inputArray.length;
		System.out.println(arrysize);
		int[] C=new int[arrysize];
		int j=0
				;
	for(int i=0; i<arrysize;i++) {
	for (int k=0; k<arrysize; k++) {
		
		if(inputArray[i]!=C[k]) {
			C[j]=inputArray[i];
			System.out.println("C "+C[j]);
			j++;
			}
		
			}
		}
	}
	
	public void fixdArrayToSet()
	{	
	int a[]	= {10,20,10,10,20};
	int b[]=new int[5];
	b[0]=a[0];
	int J=1;
	
	for (int i=1;i<5;i++) {
		int flag=0;
		for (int k=0; k<J; k++) { 
			if(a[i]==b[k])
				{
				flag=1;
			break;}}
			
			if(flag==0) {
				
				b[J]=a[i];
				J++;
			}
			}
		
		
		for(int m=0;m<J;m++) {
		System.out.println(b[m]);
		}
		}
	
	
	
public void convertArrayToSet2(int[] inputArray) {
		
		
		HashMap<Integer, Integer> mapArray= new HashMap<Integer, Integer>();
		
		for(int i:inputArray) {
			
			mapArray.put(i, i);
			
			System.out.println(mapArray);
			System.out.println(mapArray.keySet());
			System.out.println(mapArray.values());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,20,30,30,10};
		ArrayToSet obj1=new ArrayToSet();
		//obj1.convertArrayToSet1(a);
		//obj1.convertArrayToSet2(a);
		obj1.fixdArrayToSet();

	}

}
