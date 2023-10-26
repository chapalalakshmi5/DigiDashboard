
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= n; i++) {
			int current = sc.nextInt();
			max = Math.max(max, current);
		}
		System.out.println(max);
	}
}
