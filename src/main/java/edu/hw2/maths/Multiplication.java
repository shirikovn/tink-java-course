package edu.hw2.maths;

public record Multiplication(Expr firstArg, Expr secondArg) implements Expr {

	@Override
	public double evaluate() {
		return firstArg.evaluate() * secondArg.evaluate();
	}

}
