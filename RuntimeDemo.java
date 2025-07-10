package com.codegnan.oopprograms;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("total memory of heap:" + r.totalMemory());
		System.out.println("free memory of heap:" + r.freeMemory());
		long occupiedmemory = r.totalMemory() - r.freeMemory();
		System.out.println("cooupied memory of heap:" + occupiedmemory);
		Date d;
		for (int i = 0; i < 100; i++) {
			Date d = new Date();
			d=null;
		}
		System.out.println("free memory of heap:"+ r.freeMemory());
		occupiedmemory = r.totalMemory() - r.freeMemory();
		System.out.println("cooupied memory :" + occupiedmemory);
		System.out.println("free memory of heap:" + r.freeMemory());
		occupiedmemory = r.totalMemory() - r.freeMemory();
		System.out.println("cooupied memory :" + occupiedmemory);
		System.out.println("free memory of heap:" + r.freeMemory());
		
	}

}
