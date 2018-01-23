package be.vdab.taak;
import java.util.Observable;
import java.util.Observer;
public class Technieker implements Observer {
    private final long personeelsnummer;
    public Technieker(long nr) {
        this.personeelsnummer = nr;
    }
    @Override
    public void update(Observable observable, Object argument) {
        if(!(observable instanceof Fotokopiemachine)) {
            throw new IllegalArgumentException();
        }
        Fotokopiemachine machine = (Fotokopiemachine) observable;
        System.out.println("Technieker nr " + personeelsnummer 
                + " wordt op de hoogte gebracht dat onderhoud nodig is op fotokopiemachine " + machine.getSerienummer());
        /*
        De technieker doet later het onderhoud van de machine, 
        want op dit moment kunnen ook andere techniekers op de hoogte gebracht worden van deze machine 
        en het is niet de bedoeling dat meerdere techniekers tegelijk die machine onderhouden
        (zie voorbeeld in Main met één machine en twee techniekers)
        */
    }
}
