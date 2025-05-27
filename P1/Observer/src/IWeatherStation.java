public interface IWeatherStation {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    void setTemperature(Integer temperature);
    Integer getTemparature();
}
