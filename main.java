public class Main {
    public static void main(String[] args) {
        //ShapeFactory shapeFactory = new ShapeFactory();
        //ShapeFactory x= ShapeFactory.getShape("RECTANGLE")
        shape shape1 = ShapeFactory.getShape("CIRCLE");shape1.draw();
        shape shape2 = ShapeFactory.getShape("RECTANGLE");shape2.draw();
        }
}
