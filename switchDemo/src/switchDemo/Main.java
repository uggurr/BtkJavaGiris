package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		//switch durum takibi yapmak i�in kullan�l�r. Burada bir ��rencinin ald��� nota g�re ge�me durumu sim�le edildi.
		switch (grade) {
		case 'A': 
			System.out.println("M�kemmel! ge�tiniz");
		    break;
		//Yukar�da yazan kod; E�er durum A'ysa yani ��renci A ald�ysa M�kemmel! ge�tiniz yaz. ve komuttan ��k. 
		case 'B':
			System.out.println("�ok g�zel! ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi! ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il! ge�tiniz");
			break;
	    // Case 'F' ve case 'H' ayn� ��kt�y� verir.
		case 'F':
		case 'H':
			System.out.println("Malesef kald�n�z!");
			break;
			//A,B,C,D,F harflerinin d���nda bir harf girilirse uyarmak i�in default girilir.
			default:
				System.out.println("Ge�ersiz not girdiniz!");
			
		   
			
		}
	}

}
