public abstract class Shape {
    String id;
    String type;

    public void getType(){
        System.out.println(type);
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(Shape s1) throws CloneNotSupportedException {
        Shape s2;
        return s2 = (Shape)s1.clone();
    }
}
