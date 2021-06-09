package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		//switch durum takibi yapmak için kullanýlýr. Burada bir öðrencinin aldýðý nota göre geçme durumu simüle edildi.
		switch (grade) {
		case 'A': 
			System.out.println("Mükemmel! geçtiniz");
		    break;
		//Yukarýda yazan kod; Eðer durum A'ysa yani öðrenci A aldýysa Mükemmel! geçtiniz yaz. ve komuttan çýk. 
		case 'B':
			System.out.println("Çok güzel! geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi! geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil! geçtiniz");
			break;
	    // Case 'F' ve case 'H' ayný çýktýyý verir.
		case 'F':
		case 'H':
			System.out.println("Malesef kaldýnýz!");
			break;
			//A,B,C,D,F harflerinin dýþýnda bir harf girilirse uyarmak için default girilir.
			default:
				System.out.println("Geçersiz not girdiniz!");
			
		   
			
		}
	}

}
