package Activity1;

public class Company {

	private String companyName,employees,teamlead;
	
	
	//setter methods
	public void setName(String companyName) {
		this.companyName = companyName;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	
	public void setInfo(String companyName,String employees,String teamlead) {
		setName(companyName);
		setEmployees(employees);
		setTeamlead(teamlead);
	}
	
	
	
	//getter methods
	String getName() {
		return companyName;
	}
	String getEmployees() {
		return employees;
	}
	String getTeamlead() {
		return teamlead;
	}
	
	
	
	
	
	
}
