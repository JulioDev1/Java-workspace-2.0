package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manafacture;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");
	public UsedProduct(Date manafacture) {
		super();
		
	}

	public UsedProduct(String name, double price, Date manafacture) {
		super(name, price);
		this.manafacture = manafacture;
	}

	public Date getManafacture() {
		return manafacture;
	}

	public void setManafacture(Date manafacture) {
		this.manafacture = manafacture;
	}
	@Override
	public String priceTag() {
		return super.priceTag()
		+"(used $)"
		+ String.format("$ %.2f", getPrice())
		+"Manafacture Date :"
		+ sdf.format(manafacture)
		+")";
             				
		
	}
	

}

