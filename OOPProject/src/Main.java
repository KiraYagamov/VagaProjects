import Animals.Animal;
import Animals.Elephant;
import Animals.Lion;
import Animals.Tiger;

import java.util.ArrayList;

public class Main {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getIndexes(new int[]{2, 7, 11, 17}, 9)));
//    }
//    public static int[] getIndexes(int[] values, int target){
//        for (int i = 0; i < values.length; i++) {
//            for (int j = i+1; j < values.length; j++) {
//                if (values[i] + values[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
//    }

    public static void main(String[] args) {
//        Animals.Animal[] animals = {new Animals.Tiger(), new Animals.Elephant(), new Animals.Lion()};
//
//        for (Animals.Animal a: animals) {
//            a.doSound();
//        }
//        Animal[] animals = {new Elephant("Slon", 7), new Lion("Lev", 3), new Tiger("Tiger", 4)};
//        ArrayList<Animal> animalsList = new ArrayList<>();
//        animalsList.add(new Tiger("d", 4));
//        animalsList.add(new Lion("d", 4));
//        animalsList.add(new Elephant("d", 4));
//        for (int i = 0; i < animalsList.size(); i++) {
//            animalsList.get(i).doSound();
//        }

        Animal animal = new Animal("Кролик", 1) {
            @Override
            public void doSound() {
                System.out.println("Кролик издает звук");
            }
        };
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
    }
}
