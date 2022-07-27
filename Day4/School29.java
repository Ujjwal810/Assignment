package Day4;

class Pers
{
	String Name;
	String dob;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
class Teacher extends Pers
{
	double salary;
	String subject;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
class Student extends Pers
{
	int studentId;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
class collegestudent extends Student
{
	String clgname;
	int year;
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
public class School29 {
	public static void main(String[] args) {
		Pers a=new Pers();
		Teacher b=new Teacher();
		Student c=new Student();
		collegestudent d=new collegestudent();
        a.setName("Vishal");
        a.setDob("23 March");
        b.setSalary(40000);
        b.setSubject("math");
        c.setStudentId(24);
        d.setClgname("MPEC");
        d.setYear(2);
        System.out.println("Name: "+a.getName()+"\nDOB:"+a.getDob()+"\nSalary:"+b.getSalary()+"\nSubject: "+b.getSubject()+"\nStudent ID: "+c.getStudentId()+"\nCollege Name: "+d.getClgname());
	}

}
