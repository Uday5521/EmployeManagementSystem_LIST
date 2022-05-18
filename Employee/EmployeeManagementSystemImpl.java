package Employee;

import java.util.LinkedHashMap;
import java.util.Scanner;

import Example.Employee;



public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {
	
	Scanner scan = new Scanner(System.in);

	LinkedHashMap<Integer, Employee> db=
			new LinkedHashMap<Integer, Employee>();
	
	@Override
	public void addEmployee(){
		System.out.println("Enter Id:");
		int id= scan.nextInt();
		System.out.println("Enter Age:");
		int age = scan.nextInt();
		System.out.println("Enter Name:");
		String name=scan.next();
		System.out.println("Enter Marks:");
		int marks=scan.nextInt();
	}
	
		@Override
		public void removeEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeAllEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayAllEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void countEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateEmployee() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sortEmployee() {
			// TODO Auto-generated method stub
			
		}
	

		
		
		
		
	

}
