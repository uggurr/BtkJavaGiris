package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
	/*GameCalculator'� kim kullan�yorsa gameOver'� oldu�u gibi kullanmak zorunda. 
	Fakat hesapla'da kim inherit ediyorsa hesaplay� i�ermek zorunda ancak hesapla'y� override etmek zorunda.
	Abstract classlar bu nedenle kullan�l�r.*/
	
	/*Abstrac bir s�n�f�n abstract olabilmesi i�in abstract imzas�yla beslenmesi gerekiyor. Operasyonun abstract olabilmesi i�in 
	 yine abstrac ile beslenmesi gerekir. Abstract class ta illa bir abstract olmak  zorunda de�il.  */
	
	/*Abstract classlar asla newlenemez.*/
}
