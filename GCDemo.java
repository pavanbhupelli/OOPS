package com.codegnan.oopprograms;

public class GCDemo {
	protected void finalise() {
		System.out.println("DC cooects finalise method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCDemo d=new GCDemo();
		d=null; //here obj is eligible for gc 
		//System.out.println("requesting GC collercor");
		System.gc();// requesting ivm to reun gc by using system  class
	//	System.out.println("end of main");

	}
}
