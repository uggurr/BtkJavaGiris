package overriding;

public class BaseKrediManager {
	
	//E�er methoda publicten sonra final keyword� eklenirse o method override edilemez.
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
