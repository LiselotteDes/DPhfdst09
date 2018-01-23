package be.vdab.taak;
import java.util.Observable;
public class Fotokopiemachine extends Observable {
    private final long serienummer;
    private int aantalKopiesSindsLaatsteOnderhoudsbeurt;
    private static final int AANTAL_TOT_ONDERHOUD = 1000;
    public Fotokopiemachine(long nummer) {
        this.serienummer = nummer;
    }
    public void maakKopie(int paginas) {
        System.out.println(paginas + " fotokopie(s)");
        aantalKopiesSindsLaatsteOnderhoudsbeurt += paginas;
        if (aantalKopiesSindsLaatsteOnderhoudsbeurt >= AANTAL_TOT_ONDERHOUD ) {
            setChanged();
            notifyObservers();            
        }
    }
    public long getSerienummer() {
        return serienummer;
    }
    public void doeOnderhoud() {
        aantalKopiesSindsLaatsteOnderhoudsbeurt = 0;
    }
}
