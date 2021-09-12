import java.util.Scanner;

public class Calculate{
	Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Calculate(Employee employee) {
		super();
		this.employee = employee;
	}
	public static void calculate(String[] args) {
		// TODO Auto-generated method stub
		int commision;
		if(employee.profit <= 50000) {
			commision = profit+(profit*0.05);
			
			
		}else if(profit >= 50001) {
			commision = profit+(profit*0.10);
		}
		
	}

}
