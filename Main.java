package polygons;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Create the points of the quadrilateral
		Point pointA = new Point();
		Point pointB = new Point();
		Point pointC = new Point();
		Point pointD = new Point();
		
		/*Use scanner to enter coordinates of vertices
		 * and abort program if not integer is entered
		 */
		System.out.println("Enter integer numbers");
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter pointA x");
		pointA.x = scanner.nextInt();
		System.out.println("Enter pointA y");
		pointA.y = scanner.nextInt();
		System.out.println("Enter pointB x");
		pointB.x = scanner.nextInt();
		System.out.println("Enter pointB y");
		pointB.y = scanner.nextInt();
		System.out.println("Enter pointC x");
		pointC.x = scanner.nextInt();
		System.out.println("Enter pointC y");
		pointC.y = scanner.nextInt();
		System.out.println("Enter pointD x");
		pointD.x = scanner.nextInt();
		System.out.println("Enter pointD y");
		pointD.y = scanner.nextInt();
		scanner.close();
		} catch(InputMismatchException exc) {
			System.out.println(exc);
			System.exit(-1);
		}  
		
		
		System.out.println();
		
		//Test different types of quadrilaterals
		
//		Quadrilateral quadri = new Quadrilateral(pointA, pointB, pointC, pointD);
//		System.out.println(quadri.verifyShape());
//		System.out.println(quadri.calculatePerimeter());
		
//		Parallelogram paral = new Parallelogram(pointA, pointB, pointC, pointD);
//		System.out.println(paral.verifyShape());
//		System.out.println(paral.calculatePerimeter());
        
//		Rectangle rect = new Rectangle(pointA, pointB, pointC, pointD);
//		System.out.println(rect.verifyShape());
//		System.out.println(rect.calculatePerimeter());
		
//		Rhombus rhom = new Rhombus(pointA, pointB, pointC, pointD);
//		System.out.println(rhom.verifyShape());
//		System.out.println(rhom.calculatePerimeter());
		
		Square squ = new Square(pointA, pointB, pointC, pointD);
		System.out.println(squ.verifyShape());
     	System.out.println(squ.calculatePerimeter());	
	}
}
