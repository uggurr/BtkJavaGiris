package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
	/*GameCalculator'ý kim kullanýyorsa gameOver'ý olduðu gibi kullanmak zorunda. 
	Fakat hesapla'da kim inherit ediyorsa hesaplayý içermek zorunda ancak hesapla'yý override etmek zorunda.
	Abstract classlar bu nedenle kullanýlýr.*/
	
	/*Abstrac bir sýnýfýn abstract olabilmesi için abstract imzasýyla beslenmesi gerekiyor. Operasyonun abstract olabilmesi için 
	 yine abstrac ile beslenmesi gerekir. Abstract class ta illa bir abstract olmak  zorunda deðil.  */
	
	/*Abstract classlar asla newlenemez.*/
}
