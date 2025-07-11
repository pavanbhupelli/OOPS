package com.codegnan.oopprograms;

public class Box {
	double width;
	double height;
	double depth;
	public Box(double width,double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public void displayBoxDetails() {
		System.out.println("box width" + width);
		System.out.println("box width" + height);
		System.out.println("box width" + depth);
	}

}
