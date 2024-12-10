import java.util.ArrayList;
import java.util.Random;

public class GameUtils {
    static Random random = new Random();
    public static void spawnBots(int botsCount, String[] names, ArrayList<Bot> bots, int min, int max){
        for (int i = 0; i < botsCount; i++) {
            String name = names[random.nextInt(names.length-1)];
            Bot bot = new Bot(i+1, name, min, max);
            bots.add(bot);
        }
    }
}
