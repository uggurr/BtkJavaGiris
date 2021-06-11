package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc= dortIslem.topla(6, 9);
		System.out.println(sonuc);
		
		int sonuc2 = dortIslem.topla(8, 6, 4);
		System.out.println(sonuc2);

	}

}
