package javaoo;

import java.util.Scanner;

public class Circle {
	/**
	 * ����Բ������
	 * �뾶
	 * �ܳ�
	 * ���
	 * */
	public double radius;
	public double perimeter;
	public double area;
	public void inputRadius() {
		Scanner inputScanner  = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		radius = inputScanner.nextDouble();
	}
	public void showPerimter() {
		if(radius <= 0) {
			inputRadius();//�ж��Ƿ�����
		}
		perimeter = 2*Math.PI*radius;
		System.out.println("�ܳ�Ϊ��"+ perimeter);
		
	}
	public void showArea() {
		area = Math.PI*Math.pow(radius, 2);
		System.out.println("���Ϊ"+area);
	}
}
