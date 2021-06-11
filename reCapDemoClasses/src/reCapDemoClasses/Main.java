package reCapDemoClasses;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc1 = dortIslem.topla(1, 5);
		int sonuc2 = dortIslem.cikar(56, 23);
		int sonuc3 = dortIslem.carp(8, 9);
		int sonuc4 = dortIslem.bol(10, 2);
		
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);
		

	}

}
