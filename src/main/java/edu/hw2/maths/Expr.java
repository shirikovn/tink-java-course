package edu.hw2.maths;

public sealed interface Expr permits Constant, Negate, Multiplication, Addition, Exponent {
	double evaluate();
}
