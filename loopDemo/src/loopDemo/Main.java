package loopDemo;



public class Main {

	public static void main(String[] args) {
		//For
		
		/*For d�ng�s�nde ilk k�s�m saya� k�sm�d�r. �kinci k�s�m �art k�sm�d�r. son k�s�m ise sayac�n ka�ar ka�ar artaca��n�
		belirtti�imiz k�s�md�r.*/
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		
		//�ki�er iki�er artt�r.
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("---------For D�ng�s� bitti-------------");
		
		
		
		// while 
		
		// while d�ng�s� de ayn� for d�ng�s� gibi belli bir �art sa�lanana kadar i�lemi yapmaya yarar. 
		
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------While D�ng�s� bitti------------------");
		
		
		
		// Do-While
		
		//�art uymasa bile bir kere �al���r.
		int j = 1;
		do {
			System.out.println(i);
			i++;
		}while(j<10);
		
		System.out.println("-------------------Do-While D�ng�s� bitti--------------------");

	}

}
