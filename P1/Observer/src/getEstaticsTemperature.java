public class getEstaticsTemperature implements Observer{
    @Override
    public void update(WeatherStation weatherStation){
        System.out.println("Temperatura actual: " + weatherStation.getTemparature());
        System.out.println("Estadisticas de temperatura: ");
    }
    
}
