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
	static void printcompensation(String employeeName,double compen) {
		System.out.println(employeeName+" get paid "+ compen + " Baht");

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		Scanner sc2 =new Scanner (System.in);
		// TODO Auto-generated method stub
		Boolean checkEmployee=false;
		System.out.print("Input Your EmployeeID: ");
		int employeeId= sc2.nextInt();
		System.out.print("Input Your Name: ");
		String employeeName= sc.nextLine();
		System.out.print("Input Your Salary: ");
		int salary= sc.nextInt();		
		System.out.println("__________________________________");
		System.out.println("End of the month now, please answer");
		
		while (checkEmployee==false){
			System.out.print("Input Your Id: ");
			int employeeId2= sc2.nextInt();
				if(employeeId2==employeeId) {
					System.out.print("Input monthly sales : ");
					int monthlysales = sc.nextInt();
					double compen=Calculate(monthlysales,salary);
					printcompensation(employeeName,compen);
					checkEmployee=true;
				}
				else {
					System.out.println("ID Not Found");
				}
			}
	}
}
	



