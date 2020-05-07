public class Esclusa {

    private boolean nivel = false;

    public Esclusa(boolean nivel) {
	this.nivel = nivel;
    }

    public synchronized void barcoInfSup() {
	try {
	    while (nivel) wait();
	} catch (InterruptedException ie) { }
	System.out.println("Barco mar a lago");
	nivel = true;
	notifyAll();
    }

    public synchronized void barcoSupInf() {

	try {
	    while (!nivel) wait();
	} catch (InterruptedException ie) { }
	System.out.println("Barco lago a mar");
	nivel = false;
	notifyAll();
    }
}
