package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		//En büyük sayýyý bulabilmek için herhangi bir sayýyý en büyük seçiyorum.
		int enBuyuk = sayi1;
		
		//En buyük sayý yani sayi1 sayi2 den küçükse bu bloða girmez.
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		//En buyük sayý yani sayi1 sayi3 den küçükse bu bloða girmez.
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayý: " + enBuyuk);

	}

}
