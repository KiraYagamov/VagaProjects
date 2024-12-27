package Patterns.Singleton;

public class Main2 {
    public void doSomething(){
        System.out.println("Громкость: " + Settings.Instance.volume);
    }
    public void mute(){
        Settings.Instance.mute = !Settings.Instance.mute;
        System.out.println("Muted");
    }
}
