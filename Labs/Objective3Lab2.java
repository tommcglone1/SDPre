public class Objective3Lab2 {
	public static void main(String [] args) {
		double side1 = 10.0, side2 = 8.0;
		double totalside1 = side1 * side1;
		double totalside2 = side2 * side2;
		double totalbothsides = (totalside1 + totalside2);
		double hypotenuse = Math.sqrt(totalbothsides);
		System.out.println(hypotenuse);
	}
}