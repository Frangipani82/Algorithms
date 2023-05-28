package polygons;

import java.awt.Point;

//Concrete class whose parent is Quadrilateral
public class Parallelogram extends Quadrilateral{
	
	/*Class attributes that needed to check if the quadrilateral is a 
	 * parallelogram. Midpoints are needed.
	 */
	protected double midPointACx = (pointA.x + pointC.x) / 2;
	protected double midPointACy = (pointA.y + pointC.y) / 2;
	protected double midPointBDx = (pointB.x + pointD.x) / 2;
	protected double midPointBDy = (pointB.y + pointD.y) / 2;

	//Constructor of the parent
	public Parallelogram(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
	}
	
	 /* If the midpoints of the two diagonals are the same
     * the quadrilateral is a parallelogram.
     * If the shape is not a parallelogram the parent method
     * verifyShape() method is returned.
     */
    @Override
	public String verifyShape() {
    	 if(midPointACx == midPointBDx && midPointACy == midPointBDy) {
		   return "This is a parallelogram";
	   } else {
		   return super.verifyShape();
	   }
    }

    /*To calculate the perimeter of the parallelogram,
	 * the length of two adjacent sides are needed. The 
	 * perimeter is the sum of the two sides multiplied by two.
	 * If the shape is not a parallelogram the calculatePerimeter()
	 * method of the parent class is returned.
	 */
	@Override
	public double calculatePerimeter() {
		if(verifyShape() == "This is a parallelogram") {
		double lengthAB = Math.sqrt(Math.pow((pointB.x - pointA.x), 2) + Math.pow((pointB.y - pointA.y), 2));
		double lengthBC = Math.sqrt(Math.pow((pointC.x - pointB.x), 2) + Math.pow((pointC.y - pointB.y), 2));
		double perimeter = (lengthAB + lengthBC) * 2;
		return perimeter;
		} else {
			return super.calculatePerimeter();
		}
	}
}
