import java.util.*;
public class MinandMax {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			
			max=Math.max(max,arr[i]);
			min=Math.min(min, arr[i]);
		}
		System.out.println("Max value in an array is: "+max);
		System.out.println("Min Value in an array is: "+min);
	}

}
