public class Main {

    public static void main(String args[]) {
	Esclusa esclusa = new Esclusa(true);

	for (int i = 0; i < 100; i++) {

	    Barco barco = new Barco(esclusa, i % 2 == 0 ? true : false);

	    Thread t = new Thread(barco);

	    t.start();
	}
    }
}
