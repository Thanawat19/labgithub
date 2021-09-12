import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // TODO Auto-generated method stub
        String search;
        System.out.println("Input Your EmployeeID: ");
        String employeeId= sc.nextLine();
        System.out.println("Input Your Name: ");
        String employeeName= sc.nextLine();
        System.out.println("Input Your Salary: ");
        int Salary = sc.nextInt();
        sc.nextLine();
        Employee person1=new Employee(employeeId,employeeName,Salary);
        System.out.println("Search Employee by ID: ");
        search = sc.nextLine();
        if(person1.getEmployeeId().equalsIgnoreCase(search)) {
            System.out.println("Input Your Profit: ");
            int profit = sc.nextInt();
            person1.setProfit(profit);
        }
        else {
            System.out.println("can't find em id");
        }
        Calculate cal = new Calculate();
        cal.cal(person1);
    }

}