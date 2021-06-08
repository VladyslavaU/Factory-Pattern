import java.util.Arrays;
import java.util.List;

public class Margherita extends Pizza {

    @Override
    public List<Toppings> getIngredients() {
        return Arrays.asList(new Tomatoes(), new Mozzarella(), new Basil(), new OliveOil());
    }
}
