package packagesDemo;
import java.util.Scanner;

import Matematik.DortIslem;
import Matematik.Logaritma;

public class Main {

	public static void main(String[] args) {
		/*Kodlarý okuduðumuz zaman bir konuyla ilgili class'ý ararken ilgili packet'e gideriz veya bir packet'i 
		  baþka bir projede kullanabiliriz. */
		/*Bir package'ýn kullanýlabilmesi için import edilmesi gerekir.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adýnýz:");
		
		String isim = scanner.nextLine();
		
		System.out.println("Merhaba " + isim);
		
		// Kendi package'mizi yapmak 
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(2, 5);
		
		Logaritma logaritma = new Logaritma();
		logaritma.logaritmaHesapla();
	}

}
