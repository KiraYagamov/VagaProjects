import java.util.ArrayList;

public class Game {
    final String[] names = {"Петя", "Ваня", "Витя", "Робот", "Принтер", "Леха"};
    final int min = 1, max = 10;
    final int botsCount = 5;

    ArrayList<Bot> bots = new ArrayList<>();
    boolean isGameEnded = false;
    int question;

    public void start(){
        GameUtils.spawnBots(botsCount, names, bots, min, max);
        generateQuestion();
        while(!isGameEnded) {
            for (Bot bot : bots) {
                if (tryToAnswer(bot))
                    break;
            }
        }
    }
    private boolean tryToAnswer(Bot bot){
        int botAsk = bot.ask();
        if (botAsk == question){
            System.out.println("И он угадал!");
            isGameEnded = true;
            return true;
        }
        else System.out.println("И он не угадал :(");
        return false;
    }
    private void generateQuestion(){
        question = min + GameUtils.random.nextInt(max - min);
    }
}
