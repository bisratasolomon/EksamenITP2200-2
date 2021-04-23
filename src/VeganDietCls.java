import java.util.List;

public class VeganDietCls extends DietCls {
    private float minWeightKg;

    public VeganDietCls(int daysDuration, String purpose, List<FoodCls> allowedFood, boolean isVegan, float minWeightKg) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.minWeightKg = minWeightKg;
        restrictOnlyVeganFood(allowedFood);
    }

    public static void restrictOnlyVeganFood(List<FoodCls> foods){}

    public float getMinWeightKg() {
        return minWeightKg;
    }

    public void setMinWeightKg(float minWeightKg) {
        this.minWeightKg = minWeightKg;
    }
}


// wondering if min/max weight should be set by developer in code, not when init object