package entities;

public class ImportedProduct extends Product {
	public Double Customfee;

	public ImportedProduct(double customfee) {
		super();
	}

	public ImportedProduct(String name, double price, double customfee) {
		super(name, price);
		Customfee = customfee;
	}

	public double getCustomfee() {
		return Customfee;
	}

	public void setCustomfee(double customfee) {
		Customfee = customfee;
	}
	public Double totalPrice() {
		return getPrice() + Customfee;
		
	}
	@Override
	public String priceTag() {
		return super.priceTag()
				+"$"
				+String.format(" %.2f %n", totalPrice())
				+"CustomFee: $"
				+String.format("%.2f",(Customfee));
		
	}
	
	

}
