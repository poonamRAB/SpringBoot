package BetterCode;

public class AdvancedAreaCalculator {

    private IShape shape;

    public AdvancedAreaCalculator(IShape shape) {
        this.shape = shape;
    }

    public void setShape(IShape shape) {
        this.shape = shape;
    }

    public void printAreaOfShape(){
        shape.printArea();
    }
}
