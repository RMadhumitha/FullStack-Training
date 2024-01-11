import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("Enter the employee ID: ");
		int empid = myObj.nextInt();
		
		System.out.println("Enter the employee name: ");
		String empname = myObj.next();
		
		System.out.println("Enter the employee salary: ");
		float empsal = myObj.nextFloat();
		
		System.out.println("Enter the employee address: ");
		String empadd = myObj.next();
		
		System.out.println("Enter the employee contact number:");
		long empcon = myObj.nextLong();
		
		System.out.println("Enter the gender of the employee:");
		char empgen = myObj.next().charAt(0);
		
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: "+empname);
		System.out.println("Employee Salary: "+empsal);
		System.out.println("Employee Address: "+empadd);
		System.out.println("Employee Contact number: "+empcon);
		System.out.println("Employee Gender: "+empgen);
	

	}

}
