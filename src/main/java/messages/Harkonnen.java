package messages;

public class Harkonnen implements Case{  //Composite pattern
    String mesaj;

    @Override
    public void displayMesaj() {
        System.out.println("Harkonnen: "+mesaj);
    }

    public Harkonnen(String mesaj) {
        this.mesaj = mesaj;
    }
}
