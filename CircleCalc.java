import java.util.Random;
/**
* @auther William Nash
* This program uses the random number generator script to calc the area and circumference of the cirlce
 */
public class CircleCalc {
	public static void main(String[] args) {
		int radius;
		double areaNum, circumNum;
		
		Random rnd = new Random();
		radius = rnd.nextInt(25);
		areaNum = areaCalc(radius);
		circumNum = circumCalc(radius);
		System.out.printf("The area of a cirlce with the radius of %d is %.2f \n", radius,areaNum);
		System.out.printf("The circumference of a cirlce with the radius of %d is %.2f", radius,circumNum);
	}

	/**
	 * Calcs the area of the circle using the radius
	 * @param radi the radius generated
	 * @return The calculated area 
	 */
	public static double areaCalc(int radi) {
		//calcs the area
		double area = 3.14 * (radi * radi);
		return area;
	}

	/**
	 * Calcs the are of the circle using the radius
	 * @param radi the radius generated
	 * @return The calculated circumference
	 */
	public static double circumCalc(int radi) {
		//calc the circumference
		double circum = (2 * 3.14)*radi;
		return circum;
	}
	
}
