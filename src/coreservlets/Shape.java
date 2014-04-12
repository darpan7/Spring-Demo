package coreservlets;

/** Main interface. Note that you do not always have to use interfaces
 *  when you use Spring. If there is definitely exactly one concrete
 *  class, there is little point of an interface, but Spring can
 *  still manage the instantiation of the class. And, it is sometimes
 *  useful to use an abstract class instead of an interface. For instance,
 *  in these examples, we could have made Shape an abstract class and put
 *  the printInfo method here instead of in ShapeTest.
 *  
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">
 *  the coreservlets.com Java EE tutorials</a>.
 */
public interface Shape {
  public double getArea();
}
