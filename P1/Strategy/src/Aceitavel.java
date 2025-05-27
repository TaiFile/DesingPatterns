public class Aceitavel implements IBehavior {
    private static IBehavior instance = null;

    public static IBehavior getInstance() {
        if (instance == null) {
            instance = new Aceitavel();
        }
        return instance;
    }
    @Override
    public void routeCommand(pedestre pedestre) {
        // Constructor privado para evitar instanciación
        System.out.println("Comportamiento Aceitável: " + pedestre.getName() + " está aceitando as regras de trânsito.");
    }
    
}
