package edu.hw2.maths;

public record Constant(double value) implements Expr {

	@Override
	public double evaluate() {
		return value;
	}

}
