package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý: "+ mesaj.length());
		System.out.println("5. Eleman: "+ mesaj.charAt(4));
		
		//yeni bir kelime ile birleþtirmek için
		System.out.println(mesaj.concat(" yaþasýn!"));
		
		//B ile baþlýyor mu 
		System.out.println(mesaj.startsWith("B"));
		
		//. ile bitiyor mu
		System.out.println(mesaj.endsWith("."));
		
		
		// belli bir kýsmý seçmek istediðimizde getChars kullanýlýr. getChars kullanýlýrken bir array oluþturulur.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//indexOf belirttiðimiz karakterin metnin içerisinde kaçýncý sýrada olduðunu bulmamýzý saðlar. Aramaya soldan baþlar.
		System.out.println(mesaj.indexOf("a"));
		
		////indexOf belirttiðimiz karakterin metnin içerisinde kaçýncý sýrada olduðunu bulmamýzý saðlar. Aramaya saðdan baþlar.
		System.out.println(mesaj.lastIndexOf("a"));
		
		//metin üzerinde deðiþiklik yapmak istediðimizde kullanýyoruz
		System.out.println(mesaj.replace(' ', '-'));
		
		//Bir metnþn içerisinden parça almak istediðimizde
		System.out.println(mesaj.substring(2,5));
	}

}
