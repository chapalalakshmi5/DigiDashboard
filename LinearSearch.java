import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("enter the array of elements for searching");

		// intput loop  
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Key element for search");
		int key = sc.nextInt();
		int ans =-1;
		
		
		// outputloop for first occurance (left to right)
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				ans = i;
				break;
			}
		}
		
	    System.out.println("The first occurance index value of key is: "+ ans);
	   
	    
	    
	    //output loop for Last occurance (right to left)
	    for(int i=n-1;i>=0;i--)
	    {
	    	if (arr[i] == key) {
				ans = i;                    
				break;                              
			}                                       
	    }                                    
	                                                 

	    System.out.println("The last occurance index value of key is: "+ ans);
	  
	    if(ans==-1)
	    {
	    	System.out.println("The Key element in the array of elemets was not found");
	    }
		
	}

}
