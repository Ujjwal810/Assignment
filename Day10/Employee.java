package Day10;

public class Employee{
     int EmpId;
     String EmpName,Email,Gender;
     float Salary;
     
     Employee(int empid,String empName,String email,String gender,float salary)
     {
    	 EmpId=empid;
    	 EmpName=empName;
    	 Email=email;
    	 Gender=gender;
    	 Salary=salary;
     }
     public String GetEmployeeDetails()
     {
    	 return "EmpId:"+EmpId+",EmpName:"+EmpName+",Email:"+Email+",Gender:"+Gender+",Salary:"+Salary+"";
     }
     public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	
}
