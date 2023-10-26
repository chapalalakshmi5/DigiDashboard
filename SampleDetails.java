import java.util.*;


import java.lang.*;
public class SampleDetails {
	private String emp="laks";
public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public SampleDetails() {
		
	}
@Override
	public String toString() {
		return "SampleDetails [emp=" + emp + "]";
	}
public static void main(String[] args)
{
	
//	String empName="Lakshmi Chapala";
//	String empDate="28-12-2021";
//	String Emprole="A4";
	System.out.println("Enter the EmpName");
	Scanner sc=new Scanner(System.in);
	String empName=sc.nextLine();
	String empDate="28-12-2021";
	String Emprole="A4";
	int empid=46177021;
	if(empName.equals("Lakshmi Chapala")){
	System.out.println("empid:"+empid);
	System.out.println("empDateofJoining:"+ empDate);
	System.out.println("EmployeeRole:"+Emprole);
	
	}
	
	}

	

}

