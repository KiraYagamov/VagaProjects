package Patterns.Observer;

public class Main2 implements Observer {

    @Override
    public void notifyObserver() {
        System.out.println("Main2 получил температуру: " + WeatherServer.Instance.getTemp());
    }
}
