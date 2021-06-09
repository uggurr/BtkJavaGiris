package loopDemo;



public class Main {

	public static void main(String[] args) {
		//For
		
		/*For döngüsünde ilk kýsým sayaç kýsmýdýr. Ýkinci kýsým þart kýsmýdýr. son kýsým ise sayacýn kaçar kaçar artacaðýný
		belirttiðimiz kýsýmdýr.*/
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		
		//Ýkiþer ikiþer arttýr.
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("---------For Döngüsü bitti-------------");
		
		
		
		// while 
		
		// while döngüsü de ayný for döngüsü gibi belli bir þart saðlanana kadar iþlemi yapmaya yarar. 
		
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------------While Döngüsü bitti------------------");
		
		
		
		// Do-While
		
		//Þart uymasa bile bir kere çalýþýr.
		int j = 1;
		do {
			System.out.println(i);
			i++;
		}while(j<10);
		
		System.out.println("-------------------Do-While Döngüsü bitti--------------------");

	}

}
