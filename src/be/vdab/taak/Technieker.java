package be.vdab.taak;
import java.util.Observable;
import java.util.Observer;
public class Technieker implements Observer {
    private final String personeelsnummer;
    public Technieker(String nr) {
        this.personeelsnummer = nr;
    }
    @Override
    public void update(Observable observable, Object argument) {
        if(!(observable instanceof Fotokopiemachine)) {
            throw new IllegalArgumentException();
        }
        Fotokopiemachine machine = (Fotokopiemachine) observable;
        System.out.println("Technieker nr " + personeelsnummer 
                + " wordt op de hoogte gebracht dat onderhoud nodig is op fotokopiemachine " + machine.getSerienummer()
                + " na " + machine.getAantalKopies() + " aantal kopies.");
    }
}
