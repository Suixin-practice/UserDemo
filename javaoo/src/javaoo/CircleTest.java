package javaoo;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner radiuScanner= new Scanner(System.in);
		System.out.println("������뾶");
		double radius = radiuScanner.nextDouble();
		CircleV3 circle = new CircleV3(radius);
		circle.show();
	}
}
