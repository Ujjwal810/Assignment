//Test program using vector

package Day10;

public class Test1 {
	public static void main(String[] args) {
		EmpDB1 empdb = new EmpDB1();
		Employee emp1 = new Employee(1, "Vijay", "vijay@gmail.com", "Male", 27000);
		Employee emp2 = new Employee(2, "Utkarsh", "aut@gmail.com", "Male", 29000);
		Employee emp3 = new Employee(3, "Yash", "yash@gmail.com", "Male", 27500);
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		for (Employee emp : empdb.listAll()) {
			System.out.println(emp.GetEmployeeDetails());
		}
		// For delete
		System.out.println(empdb.deleteEmployee(2));
		for (Employee emp : empdb.listAll()) {
			System.out.println(emp.GetEmployeeDetails());
		}
		// For Payslip
		System.out.println(empdb.showPaySlip(3));

	}

}
