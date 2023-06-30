import BetterCode.AdvancedAreaCalculator;
import BetterCode.Circle;
import UsualCode.AreaCalculator;
import UsualCode.Rectangle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        UsualCode.Square square1 = new UsualCode.Square(3);
//        UsualCode.AreaCalculator areaCalculator = new UsualCode.AreaCalculator(square1);
//        areaCalculator.printArea(true);

//        UsualCode.Triangle t1 = new UsualCode.Triangle(5,10);
//        UsualCode.AreaCalculator areaCalculator = new UsualCode.AreaCalculator(t1);
//        areaCalculator.printArea(false);

//        Rectangle rectangle = new Rectangle(10,20);
//        AreaCalculator areaCalculator = new AreaCalculator(rectangle);
//        areaCalculator.printArea(3);

        //Better code


        //circle
        Circle c1 = new Circle(10);
        AdvancedAreaCalculator newAreaCalculator = new AdvancedAreaCalculator(c1);
        newAreaCalculator.setShape(c1);
        newAreaCalculator.printAreaOfShape();



    }
}