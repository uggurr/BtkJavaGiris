package classes;

public class Main {

	public static void main(String[] args) {
		
		//Class'lar referans tiptir.
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		
		//Say�sal de�i�kenler de�er tiplidir(value type). 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2= sayi1;
		sayi1= 30;
		System.out.println(sayi2);
		/*De�er tipli bir �ey tan�mlad���m�z zaman Heap ile hi� i�imiz olmaz her �ey stack alan�nda olur. 
		sayi2 ye 10 de�erini atad�ktan sonra sayi2 ile ili�i�imiz kalm�yor*/
		
		
		
		//Arraylar refeans tiplidir. new'ledi�imiz her �ey referans tiplidir.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		/*Sayilar1 i syilar2'ye atad�ktan sonra sayilar1 art�k sayilar2 deki de�erleri tutmaya ba�lar. 
		O y�zden cevap 10 dur*/
	}
	
	

}
