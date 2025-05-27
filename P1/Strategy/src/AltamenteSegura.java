public class AltamenteSegura implements IBehavior{
    private static AltamenteSegura instance;
    public static AltamenteSegura getInstance() {
        if (instance == null) {
            instance = new AltamenteSegura();
        }
        return instance;
    }
    @Override
    public void routeCommand(pedestre pedestre) {
        // Constructor privado para evitar instanciación
        System.out.println("Comportamiento Altamente Segura: " + pedestre.getName() + " está siguiendo todas las normas de seguridad.");
    }
}
