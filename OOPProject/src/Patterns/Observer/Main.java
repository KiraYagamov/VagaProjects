package Patterns.Observer;

public class Main implements Observer {
    WeatherServer weatherServer = new WeatherServer();

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        Main2 main2 = new Main2();

        weatherServer.registerObserver(main2);

        weatherServer.setTemp(10);
        weatherServer.registerObserver(this);
        weatherServer.setTemp(15);
        weatherServer.removeObserver(this);
        weatherServer.setTemp(20);

        weatherServer.removeObserver(main2);
    }

    @Override
    public void notifyObserver() {
        System.out.println("New temp: " + weatherServer.getTemp());
    }
}
