package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Telefon","Samsung Telefon",3000,5);
		
		System.out.println(product1.getName());
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Hp Laptop");;
		product.setPrice(5000);;
		product.setStockAmount(3);;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
