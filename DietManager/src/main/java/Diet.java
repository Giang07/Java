public abstract class Diet {
    private int daysDuration;
    private String purpose;
    private Food[] allowedFood;

    private boolean isVegan;
    private boolean isLowCarb;
    private boolean isFlexitarian;
    //private boolean isHypercaloric;

    String name;

    public int getDaysDuration() {
        return daysDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public Food[] getAllowedFood() {
        return allowedFood;
    }

    public boolean getIsVegan() {
        return isVegan;
    }

    public boolean getIsLowCarb() {
        return isLowCarb;
    }

    public boolean getIsFlexitarian() {
        return isFlexitarian;
    }

    public void setFlexitarian(boolean isFlexitarian) {
        this.isFlexitarian = isFlexitarian;
    }


    public Diet(int daysDuration, String purpose, Food[] allowedFood) {
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood;

        //check a Diet is vegan
        this.isVegan = true;
        isFlexitarian = false;
        //isHypercaloric = false;

        for (Food food : this.allowedFood) {
            if (!food.getIsVegan()) {
                this.isVegan = false;
                break;
            }
        }

        if (this.isVegan) {
            int count = 0;
            for (Food f : this.allowedFood) {
                if (f.getType() == FoodType.CARB) {
                    count += 1;
                }
            }
            if (count <= 2) {
                isLowCarb = true;
            } else {
                isLowCarb = false;
            }

        } else {
            isFlexitarian = true;
            //isHypercaloric = true;
        }


    }


    public String writeDuration() {
        int years = daysDuration / 365;
        int m = daysDuration % 365;
        int months = m / 30;
        int days = m % 30;

        String s = "This " + name + " lasts for " + years + " years, "
                + months + " months and " + days + " days.";
        return s;
    }

    public String writeAllowedFood() {
        String foodNames = "";
        for (Food food : this.allowedFood) {
            foodNames += food.getName() + ", ";
        }
        return "The following food is allowed in this " + name + ": " + foodNames.substring( 0, foodNames.length() - 2) ;
    }

    public float getMinWeightOfLowCarbDiet() {
        return 0;
    }

    public float getMaxWeightOfHypercaloric() {
        return 100000;
    }

}
