package BetterCode;

public class Triangle implements IShape{
    private int base;

    private int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void printArea() {
        System.out.println(height * base);
    }
}
