package edu.hw2.maths;

public record Addition(Expr firstVal, Expr secondVal) implements Expr {

	@Override
	public double evaluate() {
		return firstVal.evaluate() + secondVal.evaluate();
	}

}
