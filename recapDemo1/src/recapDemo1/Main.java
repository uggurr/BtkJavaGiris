package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		//En b�y�k say�y� bulabilmek i�in herhangi bir say�y� en b�y�k se�iyorum.
		int enBuyuk = sayi1;
		
		//En buy�k say� yani sayi1 sayi2 den k���kse bu blo�a girmez.
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		//En buy�k say� yani sayi1 sayi3 den k���kse bu blo�a girmez.
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k say�: " + enBuyuk);

	}

}
