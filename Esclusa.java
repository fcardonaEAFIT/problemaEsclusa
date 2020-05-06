public class Esclusa {

    private boolean nivel = false;

    public Esclusa(boolean nivel) {
	this.nivel = nivel;
    }

    public void synchronized barcoInfSup() {
	while (nivel) wait();
	nivel = true;
	notifyAll();
    }

    public void synchronized barcoSupInf() {
	while (nivel) wait();
	nivel = false;
	notifyAll();
    }
}
