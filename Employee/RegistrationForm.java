package Employee;

import java.util.Scanner;

public class RegistrationForm {
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO EMPLOYEE PROJECT");
		System.out.println("-----------------------");
		
		Scanner scan = new Scanner(System.in);
		//UPCASTING -  >ABSTACTION
		EmployeeManagementSystem ems = new EmployeeManagementSystemImpl();
		
		while(true){
			System.out.println("1: Add Employee\n2: Remove Employee");
			System.out.println("3: Remove All Employee\n4: Display Employee");
			System.out.println("5: Display All Employee\n6: Count Employee");
			System.out.println("7: Update Employee\n8: Sort Employee");
			System.out.println("9: Exit");
			System.out.println("Enter Choice: ");
			int choice=scan.nextInt();
			
			switch(choice){
			case 1:
				ems.addEmployee();
				break;
				
			case 2:
				ems.removeEmployee();
				break;
				
			case 3:
				ems.removeAllEmployee();
				break;
				
			case 4:
				ems.displayEmployee();
				break;
				
			case 5:
				ems.displayAllEmployee();
				break;
				
			case 6:
				ems.countEmployee();
				break;
				
			case 7:
				ems.updateEmployee();
				break;
				
			case 8:
				ems.sortEmployee();
				break;
				
			case 9:
				System.out.println("Thank you");
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
				System.out.println("Kindly Enter valid Choice");
				
			}
		System.out.println("-------------------");
			
			
		}
		
		
		
	}
	

}
