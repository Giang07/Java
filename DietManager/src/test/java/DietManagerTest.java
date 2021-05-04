import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class DietManagerTest {

    // ----------------------------------   Test areCompatible

    //------------------------------
    @Test
    public void testReq4_a_6(){
        Food salad = new Food("Salad", 50, true, FoodType.RECIPE);
        Food pasta = new Food("Pasta", 400, true, FoodType.RECIPE);
        Food sushi = new Food("Sushi", 350, true, FoodType.RECIPE);
        Food cheese = new Food("Cheese", 300, false, FoodType.PROTEIN);

        /*
        ArrayList<Food> allowedFood = new ArrayList<>();
        allowedFood.add(salad);
        allowedFood.add(pasta);
        allowedFood.add(sushi);
        allowedFood.add(cheese);

        ArrayList<Food> allergies = new ArrayList();
        allergies.add(cheese);

         */
        Food[] allowedFood = {salad, pasta, sushi, cheese};
        Food[] allergies = {cheese};


//if weight is more than max
        //alergies

        DietManager dm = new DietManager();
        HypercaloricDiet hc1 = new HypercaloricDiet(30, "To gain weight", allowedFood, 80, 2500);
        Person p1 = new Person(sushi, allergies, hc1, 65);
       // boolean res = dm.areCompatible2(hc1, p1);
        System.out.println(new DietManager().areCompatible(p1, hc1));
        //assertTrue(res);
    }

    @Test
    public void favoriteFoodNonVeganAndDietIsVegan() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);


        Food[] allowedFood = {salad,pizza};
        Food[] allergies = {};

        VeganDiet vegan = new VeganDiet( 370, "vegan", allowedFood, 50 );

        Person p = new Person( meat, allergies, vegan, 80 );

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == false);
    }

    @Test
    public void favoriteFoodNonVeganAndDietNonVegan() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        //Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);


        Food[] allowedFood = {salad,meat};
        Food[] allergies = {};

        FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 370, "flex",
                allowedFood, 500, meat );

        Person p = new Person( meat, allergies, flexitarianDiet, 80 );

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, flexitarianDiet) == true);
    }

    @Test
    public void favoriteFoodVeganAndDietNonVegan() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        //Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        //Food oil = new Food("oil", 100, false, FoodType.FAT);


        Food[] allowedFood = {salad,meat};
        Food[] allergies = {};

        FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 370, "flex",
                allowedFood, 500, meat );

        Person p = new Person( salad, allergies, flexitarianDiet, 80 );

        //System.out.println(new DietManager().areCompatible(p, flexitarianDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, flexitarianDiet) == true);
    }

    @Test
    public void favoriteFoodVeganAndDietVegan() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        //Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        //Food oil = new Food("oil", 100, false, FoodType.FAT);


        Food[] allowedFood = {salad,meat};
        Food[] allergies = {};

        VeganDiet vegan = new VeganDiet( 370, "vegan", allowedFood, 50 );

        Person p = new Person( salad, allergies, vegan, 80 );

        //System.out.println(new DietManager().areCompatible(p, flexitarianDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == true);
    }

    //------------------------------

    // Test the condition of allergies
    @Test
    public void allergiesEqualOrMoreThan50() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pizza, coconut};
        Food[] allergies = {pizza, coconut};

        VeganDiet vegan = new VeganDiet( 370, "vegan", allowedFood, 50 );

        Person p = new Person( salad, allergies, vegan, 60 );

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == false);
    }

    @Test
    public void allergiesLowerThan50() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pizza, coconut};
        Food[] allergies = {pizza};

        VeganDiet vegan = new VeganDiet( 370, "vegan", allowedFood, 50 );

        Person p = new Person( salad, allergies, vegan, 60 );

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == true);
    }

    // Check weight condition
    @Test
    public void weightLowerInVeganDiet() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        //Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pizza, coconut};
        Food[] allergies = {pizza};

        VeganDiet vegan = new VeganDiet(370, "vegan", allowedFood, 50);


        //FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 370, "flex", allowedFood, 100, meat );

        Person p = new Person(salad, allergies, vegan, 40);

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == false);
    }


    @Test
    public void weightOverInVeganDiet() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        //Food meat = new Food("meat", 100, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pizza, coconut};
        Food[] allergies = {pizza};

        VeganDiet vegan = new VeganDiet(370, "vegan", allowedFood, 50);


        //FlexitarianDiet flexitarianDiet = new FlexitarianDiet( 370, "flex", allowedFood, 100, meat );

        Person p = new Person(salad, allergies, vegan, 60);

        //System.out.println(new DietManager().areCompatible(p, vegan));
        Assert.assertTrue(new DietManager().areCompatible(p, vegan) == true);
    }


    @Test
    public void weightLowerInLowCarb() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food pasta = new Food("pasta", 10, true, FoodType.CARB);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pasta, pizza, coconut};
        Food[] allergies = {};

        LowCarbDiet lowCarbDiet = new LowCarbDiet(370, "vegan", allowedFood, 50);

        Person p = new Person(salad, allergies, lowCarbDiet, 40);

        //System.out.println(new DietManager().areCompatible(p, lowCarbDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, lowCarbDiet) == false);
    }

    @Test
    public void weightOverInLowCarb() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food pasta = new Food("pasta", 10, true, FoodType.CARB);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, pasta, pizza, coconut};
        Food[] allergies = {};

        LowCarbDiet lowCarbDiet = new LowCarbDiet(370, "vegan", allowedFood, 50);

        Person p = new Person(salad, allergies, lowCarbDiet, 80);

        //System.out.println(new DietManager().areCompatible(p, lowCarbDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, lowCarbDiet) == true);
    }

    @Test
    public void weightLowerInHypercaloric() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 10, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, meat, pizza, coconut};
        Food[] allergies = {};

        HypercaloricDiet hypercaloricDiet = new HypercaloricDiet(370,
                "vegan", allowedFood, 100, 300 );

        Person p = new Person(meat, allergies, hypercaloricDiet, 70);

        //System.out.println(new DietManager().areCompatible(p, hypercaloricDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, hypercaloricDiet) == true);
    }

    @Test
    public void weightOverInHypercaloric() {
        Food salad = new Food("salad", 20, true, FoodType.CARB);
        Food meat = new Food("meat", 10, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);


        Food[] allowedFood = {salad, meat, pizza, coconut};
        Food[] allergies = {};

        HypercaloricDiet hypercaloricDiet = new HypercaloricDiet(370,
                "vegan", allowedFood, 100, 300 );

        Person p = new Person(meat, allergies, hypercaloricDiet, 120);

        //System.out.println(new DietManager().areCompatible(p, hypercaloricDiet));
        Assert.assertTrue(new DietManager().areCompatible(p, hypercaloricDiet) == false);
    }



    // ---------------------------------- Test random HypercaloricDiet
    @Test
    public void randomDietTest() {
        Food f1 = new Food("salad", 20, true, FoodType.CARB);
        Food f2 = new Food("meat", 100, false, FoodType.PROTEIN);
        //Food meat = new Food("meat", 10, false, FoodType.PROTEIN);
        Food pizza = new Food("pizza", 100, true, FoodType.RECIPE);
        Food coconut = new Food("oil", 100, true, FoodType.FAT);

        Food[] allergies = {f1};

        FlexitarianDiet flexitarianDiet = new FlexitarianDiet(
                370, "flex", allergies, 100, f2 );
        Person p = new Person( f2, allergies, flexitarianDiet, 80 );

        Food[] foods = {f1,f2, pizza, coconut};

        HypercaloricDiet hypercaloricDiet = new DietManager().randomDiet(p, foods);

        //System.out.println(hypercaloricDiet.daysDuration);
        Assert.assertTrue(1 < hypercaloricDiet.getDaysDuration() && hypercaloricDiet.getDaysDuration() < 100);

        String foodNames = "";
        for (Food f : hypercaloricDiet.getAllowedFood()) {
            foodNames += f.getName() + ", ";
        }
        foodNames = foodNames.substring(0, foodNames.length()-2);

        Food[] expectFoods = {f2, pizza, coconut};
        String expectedFoodNames = "meat, pizza, oil";

        /*
        String expectedFoodNames = "";
        for (Food f : expectFoods) {
            expectedFoodNames += f.name + ", ";
        }
        expectedFoodNames = expectedFoodNames.substring(0, expectedFoodNames.length()-2);
        System.out.println(expectedFoodNames);
         */

        Assert.assertTrue(foodNames.equalsIgnoreCase(expectedFoodNames));

        Assert.assertTrue(hypercaloricDiet.getIsVegan() == false);

        Assert.assertTrue(hypercaloricDiet.getPurpose().equalsIgnoreCase("Random diet"));

        Assert.assertTrue(p.getWeight() <hypercaloricDiet.getMaxWeightOfHypercaloric() &&
                hypercaloricDiet.getMaxWeightOfHypercaloric() < p.getWeight() + 20);

        Assert.assertTrue(2000 <hypercaloricDiet.getMinCaloriesPerDay() &&
                hypercaloricDiet.getMinCaloriesPerDay() < 4000);

        /*
        System.out.println(hypercaloricDiet.allowedFood[0].name);
        System.out.println(hypercaloricDiet.isVegan);
        System.out.println(hypercaloricDiet.getMaxWeightOfHypercaloric());
        System.out.println(hypercaloricDiet.getMinCaloriesPerDay());
        */
    }

}
