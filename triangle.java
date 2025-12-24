/*
 * Ashton Chavez
 * triangle.java
 * October 29, 2024
 * 
 * Class representing an equilateral triangle, which is a 2D shape, with methods for computing area.
 */

public class triangle extends TwoDimensionalShape {
    private double side;

    public triangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;  // Formula for equilateral triangle
    }

    @Override
    public String getName() {
        return "Equilateral Triangle";
    }
}
