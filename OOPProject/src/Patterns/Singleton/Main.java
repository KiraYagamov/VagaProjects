package Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings();
        settings.volume = 20;
        settings.brightness = 40;
        settings.mute = false;

        Main2 main2 = new Main2();

        main2.doSomething();
        main2.mute();

        System.out.println(settings.mute);
    }
}
