package UsualCode;

public class AreaCalculator {
    Square square;

    Triangle triangle;

    Rectangle rectangle;

    public AreaCalculator(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public AreaCalculator(Triangle triangle) {
        this.triangle = triangle;
    }

    public AreaCalculator(Square square) {
        this.square = square;
    }

    public void printArea(int x){

        if(x == 1){
            System.out.println(square.getSide()*square.getSide());
        }
        else if(x == 2){
            System.out.println(0.5*triangle.getBase()* triangle.getHeight());
        }
        else{
            System.out.println(rectangle.getLength()*rectangle.getBreath());
        }

    }
}
