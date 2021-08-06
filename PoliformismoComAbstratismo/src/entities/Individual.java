package entities;

public class Individual extends TaxPayer {
	public double healthExpenditures;

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}

	}

}