package patrones.factory;

public class FactoryShape {

    public Shape createShape(String shapeType){
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();

            case "TRIANGLE":
                return new Triangle();

            case "SQUARE":
                return new Square();

            default: return null;

        }

    }
}
