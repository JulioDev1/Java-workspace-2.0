package entities;

public class Company extends TaxPayer {
	private Integer numberOfEmploye;

	public Company(String name, Double anualIncome, Integer numberOfEmploye) {
		super(name, anualIncome);
		this.numberOfEmploye = numberOfEmploye;

	}

	public int getNumberOfEmploye() {
		return numberOfEmploye;

	}

	public void setNumberOfEmploye(Integer numberOfEmploye) {
		this.numberOfEmploye = numberOfEmploye;

	}

	public double tax() {
		if (numberOfEmploye > 10) {
			return getAnualIncome() * 0.16;

		} else {
			return getAnualIncome() * 0.14;

		}
	}

}
