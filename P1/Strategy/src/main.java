public class main {
    public static void main(String[] args) {
        pedestre pedestre = new pedestre("João");
        pedestre.setBehavior(AltamenteSegura.getInstance());
        pedestre.getBehavior(pedestre);
    }
    
}
