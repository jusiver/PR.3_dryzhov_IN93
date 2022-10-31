public class PrototypePatternDemo {
    public static void main(String[] args) {

        Square s1 = new Square();
        Rectangle r1 = new Rectangle();
        ShapeCache sc1 = new ShapeCache();
        sc1.loadCache(1,r1);
        sc1.loadCache(2,s1);
        Shape s = sc1.getShape(1);
        Shape r = sc1.getShape(2);
        System.out.println(r);
        System.out.println(s);
    }
}