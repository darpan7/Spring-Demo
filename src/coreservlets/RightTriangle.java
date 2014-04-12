package coreservlets;

/** A concrete version of Shape. If the code that uses this needs only
 *  the area or methods that are inherited from Object, it should
 *  declare the type as Shape.
 *  
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">
 *  the coreservlets.com Java EE tutorials</a>.
 */

public class RightTriangle implements Shape {
  private double sideA, sideB;
  
  public RightTriangle() {}
  
  public RightTriangle(double sideA, double sideB) {
    setSideA(sideA);
    setSideB(sideB);
  }
  
  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }

  public double getHypotenuse() {
    return(Math.sqrt(sideA*sideA + sideB*sideB));
  }
  
  public double getArea() {
    return(0.5 * sideA * sideB);
  }
}
