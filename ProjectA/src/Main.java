import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        // TODO Auto-generated method stub
        Boolean checkEmployee=false;
        int search;
        System.out.print("Input Your EmployeeID: ");
        int employeeId= sc2.nextInt();
        System.out.print("Input Your Name: ");
        String employeeName= sc.nextLine();
        System.out.print("Input Your Salary: ");
        int Salary = sc.nextInt();
        sc.nextLine();
        System.out.println("____________________________________________________");
        System.out.println("");
        System.out.println("End of the month now, please answer");
        Employee person1=new Employee(employeeId,employeeName,Salary);
        System.out.print("Input Your EmployeeID: ");
        search = sc2.nextInt();
        
        while (checkEmployee==false){
        	if(person1.getEmployeeId()==search) {
        		System.out.print("Input monthlysales: ");
        		int monthlysales = sc.nextInt();
        		person1.setmonthlysales(monthlysales);
        		Calculate cal = new Calculate();
        		cal.cal(person1);
        		checkEmployee=true;
        	}
        	else {
            	System.out.print("can't find id");
        	}
        }
    }

}