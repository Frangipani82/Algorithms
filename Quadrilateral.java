package polygons;

import java.awt.Point;

//Concrete class whose parent is Polygon
public class Quadrilateral extends Polygon{
	
    //Class attributes, that are visible to all child classes
	protected Point pointA = new Point();
	protected Point pointB = new Point();
	protected Point pointC = new Point();
	protected Point pointD = new Point();
	
	//Constructor with points
	public Quadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}
	
	/*This method returns the type of the shape.
	 * As a quadrilateral is too general, there are no contstraints.
	 */
	public String verifyShape() {
	     return "This is a quadrilateral";
	}

	@Override
	/*calculatePerimeter() method
	 * calculates the length of all sides and adds them.
	 */
	public double calculatePerimeter() {
		double lengthAB = Math.sqrt(Math.pow((pointB.x - pointA.x), 2) + Math.pow((pointB.y - pointA.y), 2));
		double lengthBC = Math.sqrt(Math.pow((pointC.x - pointB.x), 2) + Math.pow((pointC.y - pointB.y), 2));
		double lengthCD = Math.sqrt(Math.pow((pointD.x - pointC.x), 2) + Math.pow((pointD.y - pointC.y), 2));
		double lengthAD = Math.sqrt(Math.pow((pointD.x - pointA.x), 2) + Math.pow((pointD.y - pointA.y), 2));
		double perimeter = lengthAB + lengthBC + lengthCD + lengthAD;
		return perimeter;	
	}
}
