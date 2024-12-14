package Animals;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void doSound();

    protected int getAge(){
        return age;
    }
    public void eat(){
        System.out.println(name + " ест");
    }
}
