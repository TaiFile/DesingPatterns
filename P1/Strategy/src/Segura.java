public class Segura implements IBehavior{
    private static Segura instance;
    private Segura() {
        // Constructor privado para evitar instanciación
    }
    public static Segura getInstance() {
        if (instance == null) {
            instance = new Segura();
        }
        return instance;
    }
    @Override
    public void routeCommand(pedestre pedestre) {
        // Comportamiento de seguridad
        System.out.println("Comportamiento Seguro: " + pedestre.getName() + " está cruzando la calle con precaución.");
    }
}
