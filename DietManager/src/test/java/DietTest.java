import org.junit.Assert;
import org.junit.Test;

public class DietTest {
    @Test
    public void writeDurationTest () {
        Food f1 = new Food("salad", 20, true, FoodType.CARB);
        Food f2 = new Food("meat", 100, false, FoodType.PROTEIN);

        Food[] allowedFood = {f1,f2};

        FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 370, "flex", allowedFood, 100, f2 );

        //System.out.println(flexitarianDiet.writeDuration());

        String s = "This Flexitarian Diet lasts for 1 years, 0 months and 5 days.";

        System.out.println(s);
        Assert.assertTrue(s.equalsIgnoreCase(flexitarianDiet.writeDuration()) );
    }

    @Test
    public void writeAllowedFoodTest () {
        Food f1 = new Food("salad", 20, true, FoodType.CARB);
        Food f2 = new Food("meat", 100, false, FoodType.PROTEIN);

        Food[] allowedFood = {f1,f2};

        FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 10, "flex", allowedFood, 100, f2 );

        System.out.println(flexitarianDiet.writeAllowedFood());

    }
}
