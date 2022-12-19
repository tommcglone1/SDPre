public class Objective3Lab2 {
	public static void main(String [] args) {
		double side1 = 10.0, side2 = 8.0;
		double totalSide1 = side1 * side1;
		double totalSide2 = side2 * side2;
		double totalBothSides = (totalSide1 + totalSide2);
		double hypotenuse = Math.sqrt(totalBothSides);
		System.out.println("The hypotenuse of a triangle with sides 10.0 and 8.0 is "+hypotenuse);
	} 
}