package javaoo;

public class CircleV3 {
	/**
	 * ����Բ������
	 * �뾶
	 * �ܳ�
	 * ���
	 * */
	private double radius;
	private double perimeter;
	private double area;
	
	public CircleV3() {}
	public CircleV3(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void show() {
		System.out.println("���"+ this.getArea());
		System.out.println("�ܳ�"+this.getPerimeter());
	}
	public void setRadius(double radius) {
		if(radius >= 0) {
			radius =1;
		}else {
			this.radius = radius;
		}
	}
	public double getPerimeter() {
		perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	public double getArea() {
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
}
