import java.util.*;
public class SquareOfNumber {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++)
		{
			
			  arr[i] = (i + 1) * (i + 1); // Calculate the square of the element
	          System.out.print(arr[i] + " ");
		}
	
	}

}
