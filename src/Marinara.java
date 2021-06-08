import java.util.Arrays;
import java.util.List;

public class Marinara extends Pizza {
    @Override
    public List<Toppings> getIngredients() {
        return Arrays.asList(new Tomatoes(), new Garlic(), new Oregano(), new OliveOil());
    }


}
