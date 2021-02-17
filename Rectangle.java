package com.shape;

public class Rectangle implements Polygon {
	float length;
	float breadth;
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void calArea() {
		System.out.println("Are of Rectangle is :" +(length*breadth));
		
		
	}
	@Override
	public void calPeri() {
		System.out.println("Perimeter e of Rectangle is :" +2*(length+breadth));
		
	}
	

}
