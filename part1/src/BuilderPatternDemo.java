public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder m = new MealBuilder();
        Meal res = m.prepareVegMeal();
        res.getPrice();
        Meal res1 = m.prepareNonVegMeal();
        res1.getPrice();
    }
}