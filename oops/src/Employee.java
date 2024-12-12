
public class Employee {
	//Instance props
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	//Static prop
	static String employeeOrganization = "Edubridge";
	
	//Constructor
	//To perform initialization of newly created objects
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	//Instance Method
	public void displayDetails() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);
	}
	
	@Override
	public String toString() {
		return employeeId+"\t"+employeeName+"\t"+employeeSalary;
	}
}
