package JavaAssignment3;

import java.util.Scanner;

public class Complex {

	private int real, img, sum, diff, product;

	public Complex(int real, int img) {
		super();
		this.real = real;
		this.img = img;
	}

	public Complex calSum(Complex num) {
		int real = this.real + num.real;
		int image = this.img + num.img;
		Complex result = new Complex(real, image);
		return result;
	}

	public Complex calDiff(Complex num) {
		int real = this.real - num.real;
		int image = this.img - num.img;
		Complex result = new Complex(real, image);
		return result;
	}

	public Complex calMul(Complex num) {
		int real = this.real * num.real;
		int image = this.img * num.img;
		Complex result = new Complex(real, image);
		return result;
	}

	public void diplaySum() {
		System.out.println(real + "+" + img + "i");
	}

	public void diplayDiff() {
		System.out.println(real + "-" + img + "i");
	}

	public void diplayMul() {
		System.out.println(real + "*" + img + "i");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int real1, img1, real2, img2;
		System.out.println("Enter real part of 1st number: ");
		real1 = sc.nextInt();
		System.out.println("Enter imaginary part of 1st number: ");
		img1 = sc.nextInt();
		System.out.println("Enter real part of 2nd number: ");
		real2 = sc.nextInt();
		System.out.println("Enter imaginary part of 2nd number: ");
		img2 = sc.nextInt();
		Complex complex1 = new Complex(real1, img1);
		Complex complex2 = new Complex(real2, img2);
		System.out.println("Addition of Complex Number");
		Complex result = complex1.calSum(complex2);
		result.diplaySum();

		System.out.println("Subtraction of Complex Number");
		Complex result1 = complex1.calDiff(complex2);
		result1.diplayDiff();

		System.out.println("Product of Complex Number");
		Complex result2 = complex1.calMul(complex2);
		result2.diplayMul();

	}

}
