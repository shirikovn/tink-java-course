package edu.hw2.lspProblem;

public class Rectangle extends Shape {
	private int width;
	private int height;

	void setWidth(int width) {
		this.width = width;
	}

	void setHeight(int height) {
		this.height = height;
	}

	double area() {
		return width * height;
	}
}