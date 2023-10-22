package edu.hw2.maths;

public record Exponent(Expr arg, int power) implements Expr {

	@Override
	public double evaluate() {
		return Math.pow(arg.evaluate(), power);
	}

}
