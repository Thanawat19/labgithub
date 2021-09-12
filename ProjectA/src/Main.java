import java.util.Scanner;
public class Main {

	public static void main(String[] args) {Scanner sc =new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Input Your EmployeeID: ");
		String employeeId= sc.nextLine();
		System.out.println("Input Your Name: ");
		String employeeName= sc.nextLine();
		System.out.println("Input Your Salary: ");
		int Salary= sc.nextInt();
		Employee person1=new Employee(employeeId,employeeName,Salary);
		System.out.println("Search Employee by ID: ");
		employeeId= sc.nextLine();
		if(person1.getEmployeeId()==employeeId) {
			System.out.println("Input Your Profit: ");
			int profit = sc.nextInt();
			person1.setProfit(profit);
		}
	}

}
