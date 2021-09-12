import java.util.Scanner;
public class Main {

	static double Calculate(double monthlysales,double salary){
		double commission = 0;
		if(monthlysales <= 50000) {
			commission = salary+(monthlysales*0.05);
		}
		else if(monthlysales >= 50001) {
			commission = salary+(monthlysales*0.10);
		}
		
		return commission;
	}


	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		Scanner sc2 =new Scanner (System.in);
		// TODO Auto-generated method stub
		Boolean checkEmployee=false;
		System.out.print("Input Your EmployeeID: ");
		String employeeId= sc.nextLine();
		System.out.print("Input Your Name: ");
		String employeeName= sc.nextLine();
		System.out.print("Input Your Salary: ");
		int salary= sc.nextInt();		
		System.out.println("__________________________________");
		
		
		while (checkEmployee==false){
			System.out.print("Input Your Id: ");
			String employeeId2= sc2.nextLine();
			System.out.println(employeeId);
			System.out.println(employeeId2);
//				if(employeeId2==employeeId) {
					System.out.print("Input monthly sales : ");
					int monthlysales = sc.nextInt();
					double compen=Calculate(monthlysales,salary);
					
					checkEmployee=true;
//				}
//				else {
//					System.out.println("Id Not Found");
//				}
			}
	}
}
	



