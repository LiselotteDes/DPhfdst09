package be.vdab.taak;
public class Main {
    public static void main(String[] args) {
        Fotokopiemachine machine = new Fotokopiemachine("kopiemachine_1");
        Technieker technieker1 = new Technieker("t1");
        Technieker technieker2 = new Technieker("t2");
        machine.addObserver(technieker1);
        machine.addObserver(technieker2);
        for(int i = 0; i != 102; i++) {
            machine.maakKopie();
        }
        System.out.println();
        System.out.println(machine.getAantalKopies());
        machine.deleteObserver(technieker2);
        for(int i = 0; i != 50; i++) {
            machine.maakKopie();
        }
        System.out.println();
        System.out.println(machine.getAantalKopies());
    }
    
}
