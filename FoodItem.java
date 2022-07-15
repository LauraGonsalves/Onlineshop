package application;
import java.time.LocalDate;

public class FoodItem extends Product {
	private LocalDate mfgDate, expirationDate;
	
	public FoodItem(String name, String id, int quantity, double price, LocalDate mfgDate, LocalDate expirationDate) {
		super(name, id, quantity, price, Category.Food);
		this.mfgDate = mfgDate;
		this.expirationDate = expirationDate;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public void putOnSale(Object criterion, int p) {
		LocalDate date5 = LocalDate.now(); 
		if( (expirationDate.compareTo(date5))<= (Integer)criterion) {
	       	 double price = super.getPrice();
	       	 double p1 = price - ( (price * p) / 100);	  		
	       	 setPrice(p1);
	       	 setOnSale(true);
			 setSalePercent(p);
	    }
	}
	
	public void details() {
		super.details();
		System.out.println("\tMfg Date: " +mfgDate+ " \tExp Date: "+expirationDate);
	}
}