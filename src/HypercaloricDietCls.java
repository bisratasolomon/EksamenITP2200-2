import java.util.List;

public class HypercaloricDietCls extends DietCls {
    private float maxWeightKg;
    private float minCaloriesPerDay;

    public HypercaloricDietCls(int daysDuration, String purpose, List<FoodCls> allowedFood, boolean isVegan, float maxWeightKg, float minCaloriesPerDay) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.maxWeightKg = maxWeightKg;
        this.minCaloriesPerDay = minCaloriesPerDay;
    }

    public float getMaxWeightKg() {
        return maxWeightKg;
    }

    public void setMaxWeightKg(float maxWeightKg) {
        this.maxWeightKg = maxWeightKg;
    }

    public float getMinCaloriesPerDay() {
        return minCaloriesPerDay;
    }

    public void setMinCaloriesPerDay(float minCaloriesPerDay) {
        this.minCaloriesPerDay = minCaloriesPerDay;
    }
}
