import java.util.HashMap;

public class ShapeCache {
    HashMap<Integer, Shape> ShapeMap = new HashMap<Integer, Shape>();


    public Shape getShape(Integer var) {
        return ShapeMap.get(var);
    }

    public void loadCache(Integer var, Shape var1) {
        ShapeMap.put(var, var1);
    }
}
