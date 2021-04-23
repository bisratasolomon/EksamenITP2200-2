import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LowCarbDietTest {
    List<FoodCls> lowCarbDietFoodTooManyCarbs, lowCarbDietFoodInRangeForCarbs;
    FoodCls lowCarbFood1, lowCarbFood2, lowCarbFood3, lowCarbFood4, lowCarbFood5, lowCarbFood6;

    @BeforeEach
    public void setupAll() {
        lowCarbFood1 = new FoodCls("Vegan-lasagne", 100, true, FoodTypeCls.RECIPE);
        lowCarbFood2 = new FoodCls("Falafel", 100, true, FoodTypeCls.CARB);
        lowCarbFood3 = new FoodCls("Chicken", 100, false, FoodTypeCls.PROTEIN);
        lowCarbFood4 = new FoodCls("Meat-mince", 100, true, FoodTypeCls.CARB);
        lowCarbFood5 = new FoodCls("Soy-Milk", 50, true, FoodTypeCls.CARB);
        lowCarbFood6 = new FoodCls("Chickenwings", 50, true, FoodTypeCls.PROTEIN);

        lowCarbDietFoodTooManyCarbs = List.of(lowCarbFood1, lowCarbFood2, lowCarbFood3, lowCarbFood4, lowCarbFood5);
    }

    @Test
    public void shouldThrowErrorIfTooManyCarbFoodTypes(){
        try {
            new LowCarbDiet(12, "Restrict-carbs", lowCarbDietFoodTooManyCarbs, false, 50);
        }catch (IllegalArgumentException e){
            assertEquals("Cannot exceed more than 2 foods that are of carb type", e.getMessage());
        }
    }

    @Test
    public void shouldNotThrowErrorIsInRangeForFoodTypeCarb() {
        lowCarbDietFoodInRangeForCarbs = List.of(lowCarbFood1, lowCarbFood3,lowCarbFood5, lowCarbFood6);
        assertDoesNotThrow(() -> new LowCarbDiet(12, "Restrict-carbs", lowCarbDietFoodInRangeForCarbs, false, 50));
    }
}