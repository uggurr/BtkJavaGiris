package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.firstName = "U�ur";
		customer.email = "ugur@gmail.com";
		
		System.out.println(customer.firstName + " " + customer.email);
		
		Employee employee = new Employee();
		employee.firstName="Nur�ah";
		employee.salary=4500;
		
		System.out.println(employee.firstName + " " + employee.salary);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.bestEmploye();
	}

}
