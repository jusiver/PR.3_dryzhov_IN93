public class MealBuilder {

    public Meal prepareVegMeal() {
        VegBurger vb = new VegBurger();
        vb.setter(200, "doubleFish");
        Pepsi p = new Pepsi();
        p.setter(100, "big d");
        Packing w = new Packing();
        w.setter(vb, p);
        Item item = new Item();
        item.setter(w);
        Meal m = new Meal();
        m.addItem(item);
        return m;
    }

    public Meal prepareNonVegMeal() {
        ChickenBurger vb = new ChickenBurger();
        vb.setter(220, "doubleD");
        Coke p = new Coke();
        p.setter(90, "SlurpeeDee");
        Packing w = new Packing();
        w.setter(vb, p);
        Item item = new Item();
        item.setter(w);
        Meal m = new Meal();
        m.addItem(item);
        return m;
    }
}
