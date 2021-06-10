package classes;

public class Main {

	public static void main(String[] args) {
		
		//Class'lar referans tiptir.
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		
		//Sayýsal deðiþkenler deðer tiplidir(value type). 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2= sayi1;
		sayi1= 30;
		System.out.println(sayi2);
		/*Deðer tipli bir þey tanýmladýðýmýz zaman Heap ile hiç iþimiz olmaz her þey stack alanýnda olur. 
		sayi2 ye 10 deðerini atadýktan sonra sayi2 ile iliþiðimiz kalmýyor*/
		
		
		
		//Arraylar refeans tiplidir. new'lediðimiz her þey referans tiplidir.
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		/*Sayilar1 i syilar2'ye atadýktan sonra sayilar1 artýk sayilar2 deki deðerleri tutmaya baþlar. 
		O yüzden cevap 10 dur*/
	}
	
	

}
