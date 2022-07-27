package Day4;

public class TestEmployee28 {

	public static void main(String[] args) {
		Employee obj=new Employee();
        obj.setName("Vishal");
        obj.setAnnualSalary(400000);
        obj.setYearOfJoining(2020);
        obj.setNationalInsuranceNo("DC145");
        System.out.println("Employee details are:.............. ");
        System.out.println("Employee name: "+obj.getName()+"\nSalary: "+obj.getAnnualSalary()+"\nJoining: "+obj.getYearOfJoining()+"\nInsurance number: "+obj.getNationalInsuranceNo());      
	}

}
