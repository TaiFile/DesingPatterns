public class DisplayTemperature implements Observer {
    @Override
    public void update(WeatherStation weatherStation) {
        System.out.println("Temperatura actual: " + weatherStation.getTemparature());
        System.out.println("Mostrando temperatura en pantalla...");
    }
}