package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"Uður","Yýldýz");
		customers.add(customer1);
		customers.add(new Customer(2,"Taha","Yýldýz"));
		customers.add(new Customer(3,"Nurþah","Yýldýz"));
		
		customers.remove(customer1); //Direk referans numarasýný gönderdiðim için siler.
		customers.remove(new Customer(2,"Taha","Yýldýz")); // Yeniden new'kediðim için yani yeniden referans numarasý oluþturduðum için silmez.
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		
	}

}
