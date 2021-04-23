import java.util.List;

public class PersonCls {
    private FoodCls favoriteFood;
    private List<FoodCls> allergies;
    private DietCls dietCls;
    private float weight;

    public PersonCls(FoodCls favoriteFood, List<FoodCls> allergies, DietCls dietCls, float weight) {
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.dietCls = dietCls;
        this.weight = weight;
        checkCompatibility();
    }
    public void checkCompatibility(){}

    public boolean minPersonWeight(DietCls dietCls, float weight){return false;}
    public boolean maxPersonWeight(DietCls dietCls, float weight){return false;}

    public boolean isPersonTooAllergic(DietCls dietCls, List<FoodCls> allergies){return true;}

    public boolean isPersonFavoriteFoodVegan(DietCls dietCls, FoodCls favoriteFoods){return false;}

    public List<FoodCls> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<FoodCls> allergies) {
        this.allergies = allergies;
    }

    public FoodCls getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(FoodCls favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public DietCls getDiet() { return dietCls; }

    public void setDiet(DietCls dietCls) {
        this.dietCls = dietCls;
    }

    public float getWeightKg() {
        return weight;
    }

    public void setWeightKg(float weight) {
        this.weight = weight;
    }
}

