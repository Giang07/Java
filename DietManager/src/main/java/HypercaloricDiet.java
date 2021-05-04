public class HypercaloricDiet extends Diet{
    private float maxWeightKg;
    private float minCaloriesPerDay;

    public HypercaloricDiet(int daysDuration, String purpose, Food[] allowedFood,
                            float maxWeightKg, float minCaloriesPerDay) {
        super(daysDuration, purpose, allowedFood);
        super.name = "HypercaloricDiet";

        this.maxWeightKg = maxWeightKg;
        this.minCaloriesPerDay = minCaloriesPerDay;
    }


    @Override
    public float getMaxWeightOfHypercaloric() {
        return this.maxWeightKg;
    }

    public final float getMinCaloriesPerDay() {
        return this.minCaloriesPerDay;
    }

    /*

    public HypercaloricDiet() {
        this.maxWeightKg = maxWeightKg;
        this.minCaloriesPerDay = minCaloriesPerDay;
    }

     */
}
