public class Barco implements Runnable {

    Esclusa esclusa;
    boolean mar = true;
    
    public Barco(Esclusa esclusa, boolean mar) {
	this.esclusa = esclusa;
	this.mar = mar;
    }

    public void run() {

	if (mar)
	    esclusa.barcoInfSup();
	else
	    esclusa.barcoSupInf();
    }
    
}
