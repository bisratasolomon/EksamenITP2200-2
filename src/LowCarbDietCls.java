import java.util.List;

public class LowCarbDietCls extends DietCls {
    private float minWeightKg;

    public LowCarbDietCls(int daysDuration, String purpose, List<FoodCls> allowedFood, boolean isVegan, float minWeightKg) {
        super(daysDuration, purpose, allowedFood, isVegan);
        checkCarbCount(allowedFood);
        this.minWeightKg = minWeightKg;
    }

    public static void checkCarbCount(List<FoodCls> foods){}

    public float getMinWeightKg() {
        return minWeightKg;
    }

    public void setMinWeightKg(float minWeightKg) {
        this.minWeightKg = minWeightKg;
    }
}
