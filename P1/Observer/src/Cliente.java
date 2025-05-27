public class Cliente {
    public static void main(String[] args) {
        IWeatherStation weatherStation = new WeatherStation(30);
        Observer observer1 = new getEstaticsTemperature();
        Observer observer2 = new DisplayTemperature();
        weatherStation.attach(observer1);
        weatherStation.attach(observer2);
        weatherStation.setTemperature(35);
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(20);
       
    }
}
