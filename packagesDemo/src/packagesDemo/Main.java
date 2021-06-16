package packagesDemo;
import java.util.Scanner;

import Matematik.DortIslem;
import Matematik.Logaritma;

public class Main {

	public static void main(String[] args) {
		/*Kodlar� okudu�umuz zaman bir konuyla ilgili class'� ararken ilgili packet'e gideriz veya bir packet'i 
		  ba�ka bir projede kullanabiliriz. */
		/*Bir package'�n kullan�labilmesi i�in import edilmesi gerekir.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ad�n�z:");
		
		String isim = scanner.nextLine();
		
		System.out.println("Merhaba " + isim);
		
		// Kendi package'mizi yapmak 
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(2, 5);
		
		Logaritma logaritma = new Logaritma();
		logaritma.logaritmaHesapla();
	}

}
