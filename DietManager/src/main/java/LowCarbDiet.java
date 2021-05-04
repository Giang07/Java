public class LowCarbDiet extends Diet{
    private float minWeightKg;

    public LowCarbDiet(int daysDuration, String purpose,
                       Food[] allowedFood,
                       float minWeightKg) {
        super( daysDuration, purpose, allowedFood );
        super.name = "LowCarbDiet";
        this.minWeightKg = minWeightKg;
    }

    @Override
    public float getMinWeightOfLowCarbDiet() {
        return this.minWeightKg;
    }


}
