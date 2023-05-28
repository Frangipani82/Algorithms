package polygons;

import java.awt.Point;

//Concrete class whose parent is Parallelogram
public class Rhombus extends Parallelogram{
	
	/*To verify if the quadrilateral is a shape the slopes
	 * of the diagonals are needed.
	 */
	protected double slopeAC = ((double)pointC.y - (double)pointA.y) / ((double)pointC.x - (double)pointA.x);
	protected double slopeBD = ((double)pointD.y - (double)pointB.y) / ((double)pointD.x - (double)pointB.x);
	 
	//Constructor of the parent
	public Rhombus(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
	}
	
	/*The midpoints of the two diagonals must be the same and
     * the two diagonals must be perpendicular. So, one diagonal slope
     * must be the negative reciprocal of the other diagonal slope
     * to be a rhombus.
     * If the shape is not a rhombus the parent method
     * verifyShape() method is returned.
     */
	@Override
	public String verifyShape() {
    	if((midPointACx == midPointBDx && midPointACy == midPointBDy) && (slopeAC == - (1 / slopeBD))) {
		   return "This is a rhombus";
	   } else {
		   return super.verifyShape();
	   }
    }

	/*To calculate the perimeter of a rhombus just the length of 
	 * one side is needed multiplied by two.
	 * If the quadrilateral is not a rhombus
	 * the parent calculatePerimeter() method is called.
	 */
	@Override
	public double calculatePerimeter() {
		if(verifyShape() == "This is a rhombus") {
		  double lengthAB = Math.sqrt(Math.pow((pointB.x - pointA.x), 2) + Math.pow((pointB.y - pointA.y), 2));
		  double perimeter = lengthAB * 4;
		  return perimeter;
		} else {
			return super.calculatePerimeter();
		}
	}
}
