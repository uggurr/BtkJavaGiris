package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager [] krediManagers = {new TarımKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager:krediManagers) {
			double krediSonuc = krediManager.hesapla(1000);
			System.out.println(krediSonuc);
		}

	}

}
