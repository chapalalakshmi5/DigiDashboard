import java.util.*;

public class ReverseOfArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] rev=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			rev[i]=arr[n-1-i];
			
			 
		}
		
		for(int num:rev) {
		System.out.print(num +" ");
		}
	}

}
