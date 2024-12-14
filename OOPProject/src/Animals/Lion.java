package Animals;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSound() {
        System.out.println("Лев рычит");
    }
}
