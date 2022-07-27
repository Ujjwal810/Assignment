package Day4;
public class Employee extends Person {
    double annualSalary;
    int yearOfJoining;
    String nationalInsuranceNo;

	/*
	 * public Employee(String name, double annualSalary, int yearOfJoining, String
	 * nationalInsuranceNo) { super(name); this.annualSalary = annualSalary;
	 * this.yearOfJoining = yearOfJoining; this.nationalInsuranceNo =
	 * nationalInsuranceNo; }
	 */

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

}