package Pizza;

public class Pepperoni implements Pizza{
    @Override
    public void getIngredients() {
        System.out.println("Собрали ингредиенты для пиццы пепперони");
    }

    @Override
    public void cook() {
        System.out.println("Приготовили пиццу пепперони");
    }

    @Override
    public void eat() {
        System.out.println("Съели пиццу пееперони");
    }
}
