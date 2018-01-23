package be.vdab.taak;
import java.util.Observable;
public class Fotokopiemachine extends Observable {
    private final String serienummer;
    private int aantalKopies;
    private static final int AANTAL_TOT_ONDERHOUD = 50;
    public Fotokopiemachine(String nummer) {
        this.serienummer = nummer;
    }
    public void maakKopie() {
        aantalKopies++;
        if (aantalKopies % AANTAL_TOT_ONDERHOUD == 0) {
            setChanged();
            notifyObservers();            
        }
    }
    public String getSerienummer() {
        return serienummer;
    }
    public int getAantalKopies() {
        return aantalKopies;
    }
}
