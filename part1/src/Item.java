public class Item {
    String name;
    Packing packing;
    float price;

    void setter(Packing pack){
        name = pack.burgir.name + pack.drink.name;
        packing = pack;
        price = pack.burgir.price+pack.drink.price;
    }
}
