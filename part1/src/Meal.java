import java.text.MessageFormat;
import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<Item>();

    void addItem(Item item) {
        items.add(item);
    }

    void getPrice() {
        String drink_name = items.get(0).packing.drink.name;
        Float drink_price = items.get(0).packing.drink.price;
        String burgir_name = items.get(0).packing.burgir.name;
        Float burgir_price = items.get(0).packing.burgir.price;
        String result = String.format("%s for %s\n" +
                "%s for %s", drink_price, drink_name, burgir_price, burgir_name);
        System.out.println(result);
    }

    void showItems(){

    }
}
