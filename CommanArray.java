import java.util.*;

public class CommanArray {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number  elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		boolean found =false;
		
		//input loop
		System.out.println("Please enter the arry1 of elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Please enter the arry2 of elements");
		
		for(int i=0;i<n;i++)
		{
		arr1[i]=sc.nextInt();
		}
		
		//output loop
		for(int i=0;i<n;i++)
		{
			if(arr[i]==arr1[i]) {
				found=true;
				arr2[i]=arr[i];
			}
		}
		
		if(found)
		{
			System.out.println("The thrird array prints the equal elements: ");
			for(int i=0;i<n;i++)
			{
				if(arr2[i]!=0)
				{
					System.out.print(arr2[i] +" ");
				}
			}
			
		}
		else
		{
			System.out.println("NotFound");
		}
		
	}

}
