import java.util.List;

public class FlexitarianDietCls extends DietCls {
    private float maxMeatGrams;
    private FoodCls preferredMeat;

    public FlexitarianDietCls(int daysDuration, String purpose, List<FoodCls> allowedFood, boolean isVegan, float maxMeatGrams, FoodCls preferredMeat) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.maxMeatGrams = maxMeatGrams;
        this.preferredMeat = preferredMeat;
        chkPreferredMeat(preferredMeat);
    }

    public static void chkPreferredMeat(FoodCls preferredMeat){}

    public float getMaxMeatGrams() {
        return maxMeatGrams;
    }

    public void setMaxMeatGrams(float maxMeatGrams) {
        this.maxMeatGrams = maxMeatGrams;
    }

    public FoodCls getPreferredMeat() {
        return preferredMeat;
    }

    public void setPreferredMeat(FoodCls preferredMeat) {
        this.preferredMeat = preferredMeat;
    }
}
