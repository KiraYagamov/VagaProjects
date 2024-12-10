import java.util.Random;

public class Bot {
    int id;
    String name;
    int min, max;
    Random random = new Random();

    public Bot(int id, String name, int min, int max){
        this.id = id;
        this.name = name;
        this.min = min;
        this.max = max;
        System.out.printf("Бот %s успешно создан%n", name);
    }

    public int ask(){
        int result = min + random.nextInt(max - min);
        System.out.println("Бот " + id + " - " + name + " думает, что это " + result);
        return result;
    }
}
