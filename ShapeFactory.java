public class ShapeFactory {
    private static ShapeFactory singleton = null;

    private ShapeFactory() {
    }

    public static shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            if (singleton == null) {
                singleton = new ShapeFactory();
                return new Rectangle();
            }
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            if (singleton == null) {
                singleton = new ShapeFactory();
                return new square();
            }
        }
        return null;
    }

}
