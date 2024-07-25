package c2Objects.builder.builderPattern;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder setCalories(int val){
            this.calories = val;
            return this;
        }

        public Builder setFat(int val){
            this.fat = val;
            return this;
        }

        public Builder setSodium(int val){
            this.sodium = val;
            return this;
        }

        public Builder setCarbohydrate(int val){
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public static void main(String[] args) {
        NutritionFacts coke = new NutritionFacts.Builder(240,8).setCarbohydrate(20)
                .build();

        System.out.println(coke.getServingSize());
    }
}
