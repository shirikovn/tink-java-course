package edu.hw2.maths;

public record Negate(Expr value) implements Expr {

	@Override
	public double evaluate() {
		return (-value.evaluate());
	}

}
