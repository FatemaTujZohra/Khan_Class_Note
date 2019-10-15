import java.util.Scanner;

public  class SortAnArray {
	
	Scanner sc=new Scanner(System.in);
	int n;
	int temp;
	public void dataSorting() {
		
		System.out.println("Enter how many data do you want to Input:");
		n=sc.nextInt();
		int input[]=new int[n];
		for (int i=0;i<n;i++) {
			
			System.out.println("Enter value of input["+i+"]");
			input[i]=sc.nextInt();
			
			
		}
		int l=0;
		int k=0;
		//for(int data:input) {
		for (l=0;l<n;l++) {
		 for(k=0;k<n-1;k++) {
		if(input[k]>input[k+1]) {
			
			temp=input[k];
			input[k]=input[k+1];
			input[k+1]=temp;
			
			
		}
			
		}
		}
		
		for (int temp: input) {
			
			System.out.println(temp);
		}
		
		
	}

	public static void main(String[] args) {
		
		
		SortAnArray obj=new SortAnArray();
		obj.dataSorting();
		
		

	}

}
