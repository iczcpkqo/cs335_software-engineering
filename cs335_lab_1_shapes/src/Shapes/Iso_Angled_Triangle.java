package Shapes;

import java.util.Scanner;

/**
 * This is a class for calculating the area and Circumference of isosceles triangles.
 * Contains two methods.
 * @author Xiang Mao 20251952
 * @version 1.0
 * @since 10 Feb 2020
 */
public class Iso_Angled_Triangle {

	/**
	 * Calculated area
	 * @param side double
	 * @param height double
	 * @return Area double
	 */
	public static double getArea(double side, double height) {
		return (side*height)/2;
	}

	/**
	 * Calculate the Circumference
	 * @param side double
	 * @param height double
	 * @return Circumference double
	 */
	public static double getCircumference(double side, double height) {
		return java.lang.Math.sqrt(side*side/4+height*height)*2+side;
	}

	/**
	 * The main function requires the user to enter the length and height of the base side of the isosceles triangle
	 * Returns the area and Circumference 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a length of the side:");
		double side = in.nextDouble();
		System.out.println("Enter the height:");
		double height = in.nextDouble();

		System.out.println("The area of this Isosceles angled triangle is:" + getArea(side, height));
		System.out.println("The circumference of this Isosceles angled triangle is:"+ getCircumference(side, height));
	}
}
