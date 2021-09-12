public class Employee {
	private int employeeId;
	private String employeeName;
	private int salary;
	private int monthlysales;
	
	public Employee(int employeeId, String employeeName, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.monthlysales=0;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public int getmonthlysales() {
		return monthlysales;
	}
	public void setmonthlysales(int monthlysales) {
		this.monthlysales = monthlysales;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}