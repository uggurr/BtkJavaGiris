package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+ mesaj.length());
		System.out.println("5. Eleman: "+ mesaj.charAt(4));
		
		//yeni bir kelime ile birle�tirmek i�in
		System.out.println(mesaj.concat(" ya�as�n!"));
		
		//B ile ba�l�yor mu 
		System.out.println(mesaj.startsWith("B"));
		
		//. ile bitiyor mu
		System.out.println(mesaj.endsWith("."));
		
		
		// belli bir k�sm� se�mek istedi�imizde getChars kullan�l�r. getChars kullan�l�rken bir array olu�turulur.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//indexOf belirtti�imiz karakterin metnin i�erisinde ka��nc� s�rada oldu�unu bulmam�z� sa�lar. Aramaya soldan ba�lar.
		System.out.println(mesaj.indexOf("a"));
		
		////indexOf belirtti�imiz karakterin metnin i�erisinde ka��nc� s�rada oldu�unu bulmam�z� sa�lar. Aramaya sa�dan ba�lar.
		System.out.println(mesaj.lastIndexOf("a"));
		
		//metin �zerinde de�i�iklik yapmak istedi�imizde kullan�yoruz
		System.out.println(mesaj.replace(' ', '-'));
		
		//Bir metn�n i�erisinden par�a almak istedi�imizde
		System.out.println(mesaj.substring(2,5));
	}

}
