import java.time.LocalDate;
import java.util.List;

public abstract class DietCls {
    private int daysDuration;
    private String purpose;
    private List<FoodCls> allowedFood;
    private boolean isVegan;

    public DietCls(int daysDuration, String purpose, List<FoodCls> allowedFood, boolean isVegan) {
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood; // this.allowedFood.add(allowedFood) maybe?
        this.isVegan = isVegan;
        hasOnlyVeganFood(allowedFood);
    }

    public String writeDuration(){
        calculateDuration(daysDuration);
        return "Duration in string";
    }
    public String writeAllowedFood(){
        checkAllowedFood(allowedFood);
        return "return allowed food as string";
    }

    public static void checkAllowedFood(List<FoodCls> allowedFood){}

    public static LocalDate calculateDuration(int daysDuration){ return LocalDate.now(); }

    public static void hasOnlyVeganFood(List<FoodCls> foods){}

    public int getDaysDuration() {
        return daysDuration;
    }

    public void setDaysDuration(int daysDuration) {
        this.daysDuration = daysDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public List<FoodCls> getAllowedFood() {
        return allowedFood;
    }

    public void setAllowedFood(List<FoodCls> allowedFood) {
        this.allowedFood = allowedFood;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
