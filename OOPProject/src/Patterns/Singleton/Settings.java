package Patterns.Singleton;

public class Settings {
    public static Settings Instance;

    public float volume;
    public boolean mute;
    public float brightness;

    public Settings(){
        Instance = this;
    }
}
