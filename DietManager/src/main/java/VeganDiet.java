public class VeganDiet extends Diet {
    private float minWeightKg;


    public VeganDiet(int daysDuration, String purpose, Food[] allowedFood, float minWeightKg) {
        super(daysDuration, purpose, allowedFood);
        super.name = "Vegan Diet";
        this.minWeightKg = minWeightKg;
    }

    @Override
    public float getMinWeightOfLowCarbDiet() {
        return this.minWeightKg;
    }

    /*
    public class Test {
        public void main(String args[]) {
            Food f1 = new Food("salad", 100, true, FoodType.CARB);
            Food[] allowedFood = {f1, f1 };
            VeganDiet v1 = new VeganDiet( 100, "Random Diet", allowedFood );
            System.out.println(v1.writeDuration());
        }

    }

     */


}

