import java.util.List;

abstract class Pizza {

    public List<Toppings> getIngredients() {
        return null;
    }

    public void cook() {
        List<Toppings> toppings = this.getIngredients();
        for (Toppings topping : toppings) {
            topping.addIngredient();
        }

    }

}
