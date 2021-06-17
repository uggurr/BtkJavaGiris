package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"U�ur","Y�ld�z");
		customers.add(customer1);
		customers.add(new Customer(2,"Taha","Y�ld�z"));
		customers.add(new Customer(3,"Nur�ah","Y�ld�z"));
		
		customers.remove(customer1); //Direk referans numaras�n� g�nderdi�im i�in siler.
		customers.remove(new Customer(2,"Taha","Y�ld�z")); // Yeniden new'kedi�im i�in yani yeniden referans numaras� olu�turdu�um i�in silmez.
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		
	}

}
