/**
 * Class for a rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructor for rectangle.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * returns the area of the rectangle.
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the factor to which the rectangle is scaled.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * checks if the rectangle is larger than the other rectangle.
   *
   * @param other refers to the other rectangle.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
