package exceptionHanding;



public class Main {

	public static void main(String[] args) {
		
		try {
			int[] sayilar = new int[] {1,2,3};
			System.out.println(sayilar[3]);
		}catch(StringIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
		catch(Exception exception) {
			System.out.println(exception + "Hata al�nd�");
		}finally {
			System.out.println("bu blok her t�rl� �al���r");
		}

	}

}
