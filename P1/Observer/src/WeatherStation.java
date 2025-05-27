import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeatherStation {
    private List<Observer> observer = new ArrayList<>();
    private Integer temperature;
    public WeatherStation(Integer temperature) {
        this.temperature = temperature;
    }
    public WeatherStation(){
        
    }
    @Override
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    @Override
    public Integer getTemparature() {
        return this.temperature;
    }
    
    @Override
    public void attach(Observer observer){
        this.observer.add(observer);
    }

    @Override
    public void detach(Observer observer){
        this.observer.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : this.observer) {
            observer.update(WeatherStation.this);
        }
    }
    
}
