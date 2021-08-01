package Activity1;

import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		
		String companyName,employees,techLead;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name:");
		companyName=sc.nextLine();
		System.out.println("Enter the employees:");
		employees=sc.nextLine();
		System.out.println("Enter TeamLead:");
		techLead=sc.nextLine();
		
		Company c = new Company();
		
		c.setInfo(companyName,employees,techLead);
		
		String[] empNames = employees.split(",");
		String lastMember= empNames[empNames.length-1];
		
		if(lastMember.equals(techLead)) {
			System.out.println("Name: "+c.getName()+"\n"+"Employees: "+c.getEmployees()+"\n"+"Lead: "+c.getTeamlead());
		}
		else{
			System.out.println("Invalid input.");
		}
		sc.close();
		
	}

	
}
