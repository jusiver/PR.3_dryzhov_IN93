public class Rectangle extends Shape{
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

    @Override
    public Object clone(Shape s1) throws CloneNotSupportedException {
        return super.clone(s1);
    }
}
