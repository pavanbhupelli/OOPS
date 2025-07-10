package com.codegnan.oopprograms;

public class BoxDemp_01 {

	public static void main(String[] args) {
		Box mybox1 = new Box(10,20,30);
		mybox1.displayBoxDetails();
		double volume1 = mybox1.height * mybox1.depth * mybox1.width;
		System.out.println("Box1 volume"+volume1);
		Box mybox2 = new Box(5,10,12);
		mybox2.displayBoxDetails();
		double volume2 = mybox2.height * mybox2.depth * mybox2.width;
		System.out.println("Box2 volume"+volume2);
	}

}
