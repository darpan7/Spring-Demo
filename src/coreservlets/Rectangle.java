package coreservlets;

/** A concrete version of Shape. If the code that uses this needs only
 *  the area or methods that are inherited from Object, it should
 *  declare the type as Shape.
 *  
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">
 *  the coreservlets.com Java EE tutorials</a>.
 */

public class Rectangle implements Shape {
  private double length, width;
  
  public Rectangle() {}
  
  public Rectangle(double length, double width) {
    setLength(length);
    setWidth(width);
  }
  
  public double getLength() {
    return(length);
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return(width);
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getArea() {
    return(length * width);
  }
}
