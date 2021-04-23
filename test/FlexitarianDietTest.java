import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlexitarianDietTest {
    DietCls flexitarianDietCls;
    List<FoodCls> flexitarianDietFood;
    FoodCls flexiFood1, flexiFood2, flexiFood3, flexiFood4, flexiFood5;
    @BeforeEach
    public void setupAll() {
        //Flexitarian diet
        flexiFood1 = new FoodCls("Vegan-lasagne", 100, true, FoodTypeCls.RECIPE);
        flexiFood2= new FoodCls("Falafel", 100, true, FoodTypeCls.CARB);
        flexiFood3 = new FoodCls("Chicken", 100, false, FoodTypeCls.PROTEIN);
        flexiFood4 = new FoodCls("Meat-mince", 100, true, FoodTypeCls.PROTEIN);
        flexiFood5 = new FoodCls("Soy-Milk", 50, true, FoodTypeCls.PROTEIN);

        flexitarianDietFood = List.of
                (flexiFood1,
                flexiFood2,
                flexiFood3,
                flexiFood4,
                flexiFood5);
    }

    @Test
    public void shouldThrowErrorNotVeganFoodInDiet(){
        assertThrows(RuntimeException.class, () -> {
            flexitarianDietCls = new FlexitarianDietCls(30, "Less-Meat", flexitarianDietFood, false, 200, flexiFood4);
        });
    }
    @Test
    public void shouldPass() {
        assertDoesNotThrow(() -> flexitarianDietCls = new FlexitarianDietCls(30, "Less-Meat", flexitarianDietFood, false, 200, flexiFood3));
    }
}

