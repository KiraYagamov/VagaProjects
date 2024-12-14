package Animals;

public class Tiger extends Animal {

    public Tiger(String name, int age) {
        super(name, age);
    }
    @Override
    public void doSound() {
        System.out.println("Тигр рычит");
    }
    public void bite(){
        System.out.println("Тигр кусает");
    }
}
