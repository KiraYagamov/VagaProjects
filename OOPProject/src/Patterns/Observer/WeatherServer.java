package Patterns.Observer;

import java.util.ArrayList;

public class WeatherServer {
    public static WeatherServer Instance;

    ArrayList<Observer> observerList = new ArrayList<>();

    private float temp;

    public WeatherServer(){
        Instance = this;
    }

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void setTemp(float temp){
        this.temp = temp;
        for (Observer o: observerList) {
            o.notifyObserver();
        }
    }
    public float getTemp(){
        return temp;
    }
}
