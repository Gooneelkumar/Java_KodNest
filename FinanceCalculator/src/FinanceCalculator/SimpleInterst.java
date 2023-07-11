package FinanceCalculator;

public class SimpleInterst {
	public static void main(String[] args) {
		FinanceCalculator calculator = new FinanceCalculator();

		double SI ;
		SI =calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
		System.out.printf("%.2f",SI);
	}

}
