import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class hypercaloricDietTest {
     List<FoodCls> hypercaloricDietTooFewCalories, hyperCaloricDietFoodHighInCls;
     FoodCls hypercaloricFood1, hypercaloricFood2, hypercaloricFood3, hypercaloricFood4, hypercaloricFood5, hypercaloricFood6;

     @BeforeEach
     public void setupAll() {
         hypercaloricFood1 = new FoodCls(name:"Homemade-Burger", caloriesPer100g:300, isHyperCaloric:
         true, FoodTypeCls.RECIPE);
         hypercaloricFood2 = new FoodCls(name:"Pasta", caloriesPer100g:250, isHyperCaloric:true, FoodTypeCls.CARB);
         hypercaloricFood3 = new FoodCls(name:"Macadamia-Nuts", caloriesPer100g:700, isHyperCaloric:
         true, FoodTypeCls.FAT);
         hypercaloricFood4 = new FoodCls(name:"Pizza", caloriesPer100g:250, isHyperCaloric:true, FoodTypeCls.CARB);
         hypercaloricFood5 = new FoodCls(name:"Full-Fat-Greek-Yoghurt", caloriesPer100g:140, isHyperCaloric:
         true, FoodTypeCls.PROTEIN);
         hypercaloricFood6 = new FoodCls(name:"Peanut-butter", caloriesper100g:590, isHyperCaloric:true, FoodTypeCls.FAT);

         hypercaloricDietTooFewCalories = List.of(hypercaloricFood1, hypercaloricFood2, hypercaloricFood3, hypercaloricFood4, hypercaloricFood5,hypercaloricFood6);
     }

     @Test
     public void mustReturnErrorIfCaloriesIsToLow(){
         try {
             new hypercaloricDiet (14, "")
         }






    }

}