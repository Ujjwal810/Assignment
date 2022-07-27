/* Create an application for employee management with the following classes:
a) Create an Employee class with following attributes and behaviors :
i) int empId
ii)String empName
iii)String email
iv)String gender
v)float salary
vi) void GetEmployeeDetails() -> prints employee detailsd

b) Create one more class EmployeeDB with the following attributes and behaviors.
i)ArrayList list;
ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
Provide impltion for all the methods and test your programementm*/
package Day10;

public class Test {

	public static void main(String[] args) {
		EmpDB empdb=new EmpDB();
		Employee emp1=new Employee(1,"Vijay","vijay@gmail.com","Male",27000);
		Employee emp2=new Employee(2,"Utkarsh","aut@gmail.com","Male",29000);
		Employee emp3=new Employee(3,"Yash","yash@gmail.com","Male",27500);
		empdb.addEmployee(emp1);
		empdb.addEmployee(emp2);
		empdb.addEmployee(emp3);
		for(Employee emp: empdb.listAll())
		{
			 System.out.println(emp.GetEmployeeDetails());
		}
        //For delete
		System.out.println(empdb.deleteEmployee(2));
		for(Employee emp: empdb.listAll())
		{
			 System.out.println(emp.GetEmployeeDetails());
		}
		//For Payslip
		System.out.println(empdb.showPaySlip(3));
		 
	}

}
