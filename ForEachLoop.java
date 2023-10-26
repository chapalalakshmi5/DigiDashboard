import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		// input loop
		System.out.println("Enter the array of elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key element for search");
		int key = sc.nextInt();
		boolean found = false;

		// output 4loop
		for (int num : arr) {
			if (num == key) {

				found = true;
				break;
			}
		}

		if (found) {
			System.out.print("Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
