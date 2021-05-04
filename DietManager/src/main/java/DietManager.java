import java.util.ArrayList;

public class DietManager {

    // ------------- Requirement 4a
    public boolean areCompatible(Person person, Diet diet) {

        // Check favoriteFood of person and diet are different type of vegan

        if ((!person.getFavoriteFood().getIsVegan()) && (diet.getIsVegan())) {
            return false;
        }

        // check conditions of allergies

        int count = 0;
        for (Food i : person.getAllergies()) {
            for (Food k : diet.getAllowedFood()) {
                if (i == k) {
                    count += 1;
                }
            }
        }

        float percent = (float) count/diet.getAllowedFood().length;

        if (percent >= 0.5) {
            return false;
        }

        // Check weight

        if ((diet.getIsVegan()) || (diet.getIsLowCarb())) {
            if (person.getWeight() < diet.getMinWeightOfLowCarbDiet()) {
                return false;
            }
        }

        //if (diet.isHypercaloric) {
            if (person.getWeight() > diet.getMaxWeightOfHypercaloric()) {
                return false;
            }
       // }

        return true;
    }

    // ----------------------- Requirement 4b
    public static HypercaloricDiet randomDiet(Person person, Food[] foods) {
        int daysDuration = (1 + (int) (Math.random() * ((100 - 1) + 1)));

        String purpose = "Random diet";


        ArrayList<Food> allowedFood = new ArrayList<Food>();

        for (Food f : foods) {
            for (Food a : person.getAllergies()) {
                if (f != a) {
                    //if (!person.allergies.contains(f)) {
                    allowedFood.add( f );
                }
            }
        }

        Food[] myAllowedFood = new Food[allowedFood.size()];
        allowedFood.toArray(myAllowedFood);


        float maxWeightKg = (person.getWeight() + (int) (Math.random() *
                ((person.getWeight() + 20 - person.getWeight()) + 1)));

        float minCaloriesPerDay = (2000 + (int) (Math.random() * ((4000 - 2000) + 1)));


        HypercaloricDiet hypercaloricDiet = new HypercaloricDiet(daysDuration, purpose,
                myAllowedFood, maxWeightKg, minCaloriesPerDay);

        /*
        String foodNames = "";
        for (Food f : myAllowedFood) {
            foodNames += f.name + ", ";
        }
        foodNames = foodNames.substring(0, foodNames.length()-2);

        System.out.print("DaysDuration: " + daysDuration + ".\n"
                + "Purpose: " + purpose + ".\n"
                + "AllowedFood: " + foodNames + ".\n"
                + "isVegan: " + hypercaloricDiet.isVegan + ".\n"
                + "maxWeightKg: " + maxWeightKg + ".\n"
                + "minCalroiesPerDay: " + minCaloriesPerDay + ".");

         */
        return hypercaloricDiet;

    }

}
