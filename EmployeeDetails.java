package week1.day2;

public class EmployeeDetails {
	public void Employeename() {
		String empName ="praveen";
		int empId = 18100;
		System.out.println(empName);
		System.out.println(empId);
	}
	public void EmpAddress() {
		String empAddress = "salem";
		System.out.println(empAddress);
	}
	public void EmpSalary() {
		double empSalary=15000.00;
		System.out.println(empSalary);
	}
	public void EmployeeMobileNumber() {
	    long mobNum=6379311990L;
	    System.out.println(mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails lap = new EmployeeDetails();
		lap.Employeename();
		lap.EmpAddress();
		lap.EmpSalary();
		lap.EmployeeMobileNumber();
		
		
	}

}
