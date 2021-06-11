package overriding;

public class BaseKrediManager {
	
	//Eðer methoda publicten sonra final keywordü eklenirse o method override edilemez.
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
