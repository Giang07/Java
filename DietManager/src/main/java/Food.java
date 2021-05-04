public class Food {
    private String name;
    private float caloriesPer100g;
    private boolean isVegan;
    private FoodType type;

    public String getName() {
        return name;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public FoodType getType() {
        return type;
    }

    public Food(String name, float caloriesPer100g, boolean isVegan, FoodType type) {
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
        this.isVegan = isVegan;
        this.type = type;
    }

}
