package messages;

public class Oguuk implements DecodingStrategy{  //Strategy pattern

    @Override
    public void decodingMethod() {
        System.out.println("Sirul Oguuk");
    }
}
