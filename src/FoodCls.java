
public class FoodCls {
    private String name;
    private float caloriesPer100g;
    private boolean isVegan;
    private FoodTypeCls type;

    public FoodCls(String name, float caloriesPer100g, boolean isVegan, FoodTypeCls type) {
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
        this.isVegan = isVegan;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(float caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public FoodTypeCls getType() {
        return type;
    }

    public void setType(FoodTypeCls type) {
        this.type = type;
    }
}
