package methods2;

public class Main {

	public static void main(String[] args) {
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		int toplam = topla2(1,2,3,4,5,6,7);
		System.out.println(toplam);
	}
	
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1 + sayi2;
	}
	//Variable arguments 
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
