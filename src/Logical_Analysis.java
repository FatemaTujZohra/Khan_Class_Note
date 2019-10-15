import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public  class Logical_Analysis {
	Scanner sc= new Scanner (System.in);
	int a,b, z, listsize;
	List<Integer> listData=new ArrayList<Integer>();
	
	public  int sum() {
		
		//Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Value of a ="+a);
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Value of b ="+b);
		
		z=a+b;
		
		return z;
	}
	
	public void listOperation()
	{
		System.out.println("How many data do you want to enter in the List?");
		//sc.nextInt(listsize); PatternSynaxException
		listsize=sc.nextInt();
		System.out.println("Add value in the list");
		for (int i=0;i<listsize;i++)
		{
			//int k=0;
			listData.add(sc.nextInt());
		
		}
		
		System.out.println("List values ");
		for(int temp:listData) {
			
			System.out.println(temp);
		}
		
		Collections.sort(listData); 
		System.out.println("Sorted list values ");
		for(int temp:listData) {
			
			System.out.println(temp);
		}
		
		
		
		
	}
	
	public void listToSet()
	
		{
		System.out.println("How many data do you want to enter in the List?");
		//sc.nextInt(listsize); PatternSynaxException
		listsize=sc.nextInt();
		System.out.println("Add value in the list");
		for (int i=0;i<4;i++)
				{
			//int k=0;
			listData.add(sc.nextInt());
		
				}
		int k[]=new int[listsize];
		int count=0;
		boolean flag;
		for (int temp1: listData){
			flag=false;
			for (int j=0;j<=count;)
			{
				if(temp1==k[j]) {
				 flag=true;
				break;	}
				
				
				if (flag=false) {
					k[count]=temp1;
					count++;
				}
					
			}	
			
		}
		
		for (int m=0;m<count-1; m++)
			
		{
			System.out.println(k[m]);
			
		}
		
		
		}
	
	
	

	public static void main(String[] args) {
		
		Logical_Analysis obj=new Logical_Analysis();
		
		
		//System.out.println("Value of zis"+obj.sum());
		// TODO Auto-generated method stub
		
		//obj.listOperation();
		obj.listToSet();
		
		
		
		
		
		

	}

}
