package polygons;

import java.awt.Point;

//Concrete class whose parent is Parallelogram
public class Square extends Rhombus{

	//Constructor of the parent
	public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
		super(pointA, pointB, pointC, pointD);
	}
 
	/*The midpoints of the two diagonals must be the same,
     * the two diagonals must be perpendicular (one diagonal slope
     * must be the negative reciprocal of the other diagonal slope) and they 
     * must be congruent to be a square.
     * If the shape is not a square the parent method
     * verifyShape() method is returned.
     */
	@Override
	public String verifyShape() {
		double diagonalLengthAC = Math.sqrt(Math.pow((pointC.x - pointA.x), 2) + Math.pow((pointC.y - pointA.y), 2));
	    double diagonalLengthBD = Math.sqrt(Math.pow((pointD.x - pointB.x), 2) + Math.pow((pointD.y - pointB.y), 2));
      
    	if((midPointACx == midPointBDx && midPointACy == midPointBDy) && (slopeAC == - 1 / slopeBD) && (diagonalLengthAC == diagonalLengthBD)) {
		   return "This is a square";
	   } else {
		   return super.verifyShape();
	   }
	}
    	
	/*To calculate the perimeter of a square is the same
	 * than calculating the perimeter of the rhombus. 
	 * The parent method is used.
	 */
   	@Override
       public double calculatePerimeter() {
			return super.calculatePerimeter();
   	}
}
	
	

