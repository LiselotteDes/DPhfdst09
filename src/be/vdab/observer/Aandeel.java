package be.vdab.observer;
import java.math.BigDecimal;
import java.util.Observable;

public class Aandeel extends Observable {
    private final String code;
    private BigDecimal koers;
    public Aandeel(String code) {
        this.code = code;
    }
    public void setKoers(BigDecimal nieuweKoers) {
        this.koers = nieuweKoers;
        /*
        Als een gebeurtenis optreedt (de koers wijzigt),
        roep je de method setChanged op, gevolgd door de method notifyObservers.
        Deze method overloopt de observers in de verzameling en roept op elke observer de method update op,
        om de observer van de gebeurtenis op de hoogte te brengen.
        */
        setChanged();
        notifyObservers();
    }
    public String getCode() {
        return code;
    }
    public BigDecimal getKoers() {
        return koers;
    }
}
