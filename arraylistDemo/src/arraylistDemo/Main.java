package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*Dizilerde yeni bir eleman eklemek istedi�inizde s�n�r�n d���na ��kt�n�z uyar�s� al�r�z ve ekleyemeyiz
		  koleksiyonlar arkada bir diziyi y�netir. Bu nedenle arraylist kullan�l�r.*/
		
		ArrayList sayilar = new ArrayList();
		/*Arraylist'ler bu �ekilde object olarak kullanl�labilir fakat tercih edilmez.��nk� tip g�venli�i sa�lamaz.*/
		
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
