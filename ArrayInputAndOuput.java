import java.util.*;

public class ArrayInputAndOuput {

	public static void main(String[] args) {

		System.out.println("Enter the Array Elemets ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] rollnum = new int[n];
		String[] emp_Name = new String[n];
		char[] emp_role = new char[n];

		// input loop
		System.out.println("Enter the rollnumber of an employee");
		for (int i = 0; i < n; i++) {
			rollnum[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Enter the Employee name");
		for (int i = 0; i < n; i++) {
			emp_Name[i] = sc.nextLine();
		}
		System.out.println("Enter the Employee role");
		for (int i = 0; i < n; i++) {
			emp_role[i] = sc.next().charAt(0);
		}

		// output loop
		for (int i = 0; i < n; i++) {
			System.out.println("the Employee_Rollnum =" + rollnum[i] + "  Employee_Name=" + emp_Name[i]
					+ "  Employee_Role=" + emp_role[i]);
		}
		for (int i = 0; i < n; i++) {
			if (emp_Name[i].equals("Lakshmi Chapala")) {

				System.out.println("the Employee_Rollnum =" + rollnum[i] + "  Employee_Name=" + emp_Name[i]
						+ "  Employee_Role=" + emp_role[i]);
			}
		}
	}
}
