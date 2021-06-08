import java.util.Arrays;
import java.util.List;

public class MargheritaExtra extends Pizza {
    @Override
    public List<Toppings> getIngredients() {
        return Arrays.asList(new Tomatoes(), new MozzarellaCampania(), new Basil(), new OliveOil());
    }
}
