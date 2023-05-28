package polygons;

import java.awt.Point;

//Concrete class whose parent is Parallelogram
public class Rectangle extends Parallelogram {
	
	//Constructor of the parent
	public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
	}

	/*The midpoints of the two diagonals must be the same
     * and the length of the two diagonals must be the same as well
     * to be a rectangle.
     * If the shape is not a rectangle the parent method
     * verifyShape() method is returned.
     */
	@Override
	public String verifyShape() {
		double diagonalLengthAC = Math.sqrt(Math.pow((pointC.x - pointA.x), 2) + Math.pow((pointC.y - pointA.y), 2));
	    double diagonalLengthBD = Math.sqrt(Math.pow((pointD.x - pointB.x), 2) + Math.pow((pointD.y - pointB.y), 2));
    	if((midPointACx == midPointBDx && midPointACy == midPointBDy) && (diagonalLengthAC == diagonalLengthBD)) {
    	   return "This is a rectangle";
	   } else {
		   return super.verifyShape();
	   }
    }
	/*To calculate the perimeter of a rectangle is the same
	 * than calculating the perimeter of the parallelogram. 
	 * The parent method is used.
	 */
	@Override
	public double calculatePerimeter() {
		return super.calculatePerimeter();
		
	}
}
