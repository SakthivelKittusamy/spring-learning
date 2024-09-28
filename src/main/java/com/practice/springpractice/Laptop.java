package com.practice.springpractice;

public class Laptop implements Computer {

	@Override
	public void compile() {
		System.out.println("Laptop compiling...");
	}

}
