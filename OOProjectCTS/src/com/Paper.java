package com;

public class Paper {
	
	String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		return evaluator.evaluate(this);
	}
}
