package coreservlets;

/** A concrete version of Shape. If the code that uses this needs only
 *  the area or methods that are inherited from Object, it should
 *  declare the type as Shape.
 *  
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">
 *  the coreservlets.com Java EE tutorials</a>.
 */

public class Circle implements Shape {
  private double radius = 1.0;
  
  public Circle() {}
  
  public Circle(double radius) {
    setRadius(radius);
  }
  
  public double getRadius() {
    return(radius);
  }
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return(Math.PI * radius * radius);
  }
}
