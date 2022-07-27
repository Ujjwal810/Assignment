package Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpDB {

		ArrayList<Employee> list=new ArrayList<>();
		 boolean addEmployee(Employee e) 
		 {
			 return list.add(e);
		 }
		 boolean deleteEmployee(int empId)
		 {
			 boolean flag=false;
			 Iterator<Employee> it=list.iterator();
			 while(it.hasNext())
			 {
				 Employee emp=it.next();
				 if(emp.getEmpId()==empId)
				 {
					 flag=true;
					 it.remove();
				 }
			 }
			 return flag;
		 }
		 String showPaySlip(int empId) 
		 {
			 String payslip="Invalid employee id";
			 for(Employee emp: list)
			 {
				 if(emp.getEmpId()==empId)
				 {
					 payslip="Payslip for Employee "+empId+" is "+emp.getSalary();
				 }
			 }
			 return payslip;
		 }
		 public Employee[] listAll() {
			  Employee[] empArray = new Employee[list.size()];
			  for(int i =0; i<list.size();i++)
			  {
			   empArray[i]=list.get(i);
			  }
			  return empArray;
			 }
		 


}
