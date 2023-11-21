package messages;

public class Main {
    public static void main(String args[]){

        Messi sirM3 = new Messi();
        Messi sirM4 = new Messi();

        sirM3.setDecodingStrategy(new Jbppf());
        sirM4.setDecodingStrategy(new Oguuk());

        sirM3.decodingMethod();
        sirM4.decodingMethod();

        Harkonnen mesaj1 = new Harkonnen("Brjkjfjwcbjwbqjkjcbjkjj");
        Atreides mesaj2 = new Atreides("VFvwrkjencjcbq");
        Harkonnen mesaj3 = new Harkonnen("BTrebbrw");
        Atreides mesaj4 = new Atreides("Fvvwvv");

        Arrakis interceptor = new Arrakis();
        interceptor.addMesaj(mesaj1);
        interceptor.addMesaj(mesaj2);

        Arrakis interceptorNou = new Arrakis();
        interceptorNou.addMesaj(mesaj3);
        interceptorNou.addMesaj(mesaj4);

        interceptor.displayMesaj();
        interceptorNou.displayMesaj();

        interceptor.salvareMesaje();


    }
}
