public class FlexitarianDiet extends Diet{
    private float maxMeatGramsPerWeek;
    private Food preferredMeat;

    public FlexitarianDiet(int daysDuration, String purpose,
                           Food[] allowedFood,
                           float maxMeatGramsPerWeek, Food preferredMeat) {
        super(daysDuration, purpose, allowedFood);
        super.name = "Flexitarian Diet";

        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
        this.preferredMeat = preferredMeat;

        if (super.getIsFlexitarian()) {
            if (!((preferredMeat.getIsVegan() == false) && (preferredMeat.getType() == FoodType.PROTEIN))) {
                setFlexitarian(false);
            }
        }
    }

}


