public class Person {
    private Food favouriteFood;
    private Food[] allergies;
    private Diet diet;
    private float weight;

    public Person(Food favouriteFood, Food[] allergies, Diet diet, float weight) {
        this.favouriteFood = favouriteFood;
        this.allergies = allergies;
        this.diet = diet;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }


    public Food getFavoriteFood() {
        return favouriteFood;
    }


    public Food[] getAllergies() {
        return allergies;
    }

    /*
    public Diet getDiet() {
        return diet;
    }

     */

}
