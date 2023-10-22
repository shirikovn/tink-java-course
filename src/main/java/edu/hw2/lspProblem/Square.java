package edu.hw2.lspProblem;

public class Square extends Shape{  

	private int side;
	
	void setSide(int side) {
		this.side = side;
	}


	double area() {
		return side * side;
	}
}