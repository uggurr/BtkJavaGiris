package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*Dizilerde yeni bir eleman eklemek istediðinizde sýnýrýn dýþýna çýktýnýz uyarýsý alýrýz ve ekleyemeyiz
		  koleksiyonlar arkada bir diziyi yönetir. Bu nedenle arraylist kullanýlýr.*/
		
		ArrayList sayilar = new ArrayList();
		/*Arraylist'ler bu þekilde object olarak kullanlýlabilir fakat tercih edilmez.Çünkü tip güvenliði saðlamaz.*/
		
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		System.out.println(sayilar.size());
		
		
		System.out.println("----------------------");
		
		System.out.println(sayilar.get(0));
		
		
		System.out.println("----------------------");
		
		for (Object object : sayilar) {
			System.out.println(object);
		}

	}

}
