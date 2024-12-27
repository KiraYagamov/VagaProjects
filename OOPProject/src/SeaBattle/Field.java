package SeaBattle;

import java.util.Random;

public class Field {
    Random random = new Random();
    public int[] field = new int[10];
    public int shipLength = 3;

    public void generateField(){
        int pos = Math.abs(random.nextInt()) % (field.length - (shipLength-1));
        for (int i = pos; i < pos + shipLength; i++) {
            field[i] = 1;
        }
    }
    public void printField(){
        for (int i = 0; i < field.length-1; i++) {
            System.out.print(field[i] + ", ");
        }
        System.out.println(field[field.length-1]);
    }
}
