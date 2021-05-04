package clasAndObjects;

public class Main {

	public static void main(String[] args) {

		Polygon rectangle = new Polygon();

		Polygon triangle = new Polygon();

		Polygon polygon = new Polygon();

		rectangle.setColor("Green");
		System.out.println(rectangle.getColor());
		rectangle.setSides(4);
		System.out.println(rectangle.getSides());
		triangle.setColor("Blue");
		System.out.println(triangle.getColor());
		triangle.setSides(3);
		System.out.println(triangle.getSides());
		polygon.setColor("Red");
		System.out.println(polygon.getColor());
		polygon.setSides(5);
		System.out.println(polygon.getSides());
	
	}

}
