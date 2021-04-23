
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sun.tools.javac.util.List.*;
import static org.junit.jupiter.api.Assertions.*;

class VeganDietTest {
DietCls notVeganDiet;
List<FoodCls> notVeganDietFood;
FoodCls notVeganFood1, notVeganFood2, notVeganFood3, notVeganFood4, notVeganFood5;


@BeforeEach
    public void setupAll() {
        notVeganFood1 = new FoodCls("Vegan-lasagne", 100, true, FoodTypeCls.RECIPE);
        notVeganFood2 = new FoodCls("Falafel", 100, true, FoodTypeCls.CARB);
        notVeganFood3 = new FoodCls("Chickpea", 100, true, FoodTypeCls.PROTEIN);
        notVeganFood4 = new FoodCls("Meat-mince", 100, false, FoodTypeCls.PROTEIN);
        notVeganFood5 = new FoodCls("Chocolate-Milk", 50, true, FoodTypeCls.PROTEIN);

    notVeganDietFood = List.of(notVeganFood1, notVeganFood2, notVeganFood3, notVeganFood4, notVeganFood5);

}
    @Test
    public void shouldThrowErrorNotVeganFoodInDiet(){

        assertThrows(RuntimeException.class, () -> {
            notVeganDiet = new VeganDietCls(30, "weight-loss", notVeganDietFood, true, 50);
        });
    }
}