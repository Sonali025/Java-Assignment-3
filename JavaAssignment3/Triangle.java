package JavaAssignment3;

public class Triangle {

	protected double side1;
	protected double side2;
	protected double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public double calPerimeter() {
		double Perimeter = side1 + side2 + side3;
		return Perimeter;

	}

	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public void display() {
		System.out.println("Side1=" + side1);
		System.out.println("Side2=" + side2);
		System.out.println("Side3=" + side3);
		System.out.println("Perimeter=" + calPerimeter());
		System.out.println("Area=" + calculateArea());

	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		triangle.calPerimeter();
		triangle.calculateArea();
		triangle.display();
	}

}
