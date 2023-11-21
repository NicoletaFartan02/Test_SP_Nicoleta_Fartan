package messages;

public class Atreides implements Case{ //Composite pattern
    String mesaj;

    @Override
    public void displayMesaj() {
        System.out.println("Atreides: "+ mesaj);
    }

    public Atreides(String mesaj) {
        this.mesaj = mesaj;
    }
}
