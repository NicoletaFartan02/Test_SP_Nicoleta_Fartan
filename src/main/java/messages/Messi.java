package messages;

public class Messi implements DecodingStrategy{   //Strategy pattern
    String sir;
    private DecodingStrategy decodingStrategy;
    public void setDecodingStrategy(DecodingStrategy decodingStrategy){
        this.decodingStrategy = decodingStrategy;
    }
    @Override
    public void decodingMethod() {

        decodingStrategy.decodingMethod();

    }
    public void decodificareSirJbppf(){
        System.out.println("S-a decodificat sirul Jbppf");
    }
    public void decodificareSirOguuk(){
        System.out.println("S-a decodificat sirul Oguuk");
    }
}
