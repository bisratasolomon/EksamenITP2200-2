import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DietManagerTest {
    List<FoodCls> allowedFoods, allergies;
    FoodCls favouriteFood, food1, food2, food3, food4, food5, food6;
    PersonCls personRandom;
    DietManagerCls manager;

    @BeforeEach
    public void setup() {
        favouriteFood = new FoodCls("Lasagne", 135, false, FoodTypeCls.RECIPE); //dobbeltsjekk med gruppa foodtype
        food1 = new FoodCls("Chicken", 100, false, FoodTypeCls.CARB); //dobbeltsjekk med gruppa foodtype
        food2 = new FoodCls("Meat-mince", 100, true, FoodTypeCls.PROTEIN); //dobbeltsjekk med gruppa foodtype
        food3 = new FoodCls("Pasta", 131, true, FoodTypeCls.RECIPE); //dobbeltsjekk med gruppa foodtype
        food4 = new FoodCls("Lasagne", 135, false, FoodTypeCls.CARB); //dobbeltsjekk med gruppa foodtype
        food5 = new FoodCls("Lasagne", 135, false, FoodTypeCls.CARB); //dobbeltsjekk med gruppa foodtype
        food6 = new FoodCls("Lasagne", 135, false, FoodTypeCls.CARB); //dobbeltsjekk med gruppa foodtype

        allergies = new ArrayList<>(List.of(food1, food3, food4));
        allowedFoods = new ArrayList<>(List.of(food1, food2, food5));
        personRandom = new PersonCls(favouriteFood, allergies, 83);
        manager = new DietManagerCls();
        personRandom.setDiet(manager.randomDiet(personRandom, allowedFoods));
    }

    @Test
    public void notThrowError() {
        assertNotThrow(() -> personRandom.setDiet(manager.randomDiet(personRandom, allowedFoods)));
    }

    @Test
    public void randomWeightInRange() {
        assertTrue(0 <= ( HypercaloricDietCls) personRandom.getDiet()).getMaxWeightKg() && ()
    }

    @Test
    public void randomCaloriesInRange() {
        assertTrue(2000 < ( (HypercaloricDietCls) personRandom.getDiet()).getMinCaloriesPerDay() && ( (HypercaloricDietCls) personRandom.getDiet()).getMinCaloriesPerDay() < 4000);
        System.out.println("Duration" + ( (HypercaloricDietCls) personRandom.getDiet()).getDaysDuration());
    }
}