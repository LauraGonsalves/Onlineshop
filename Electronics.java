package application;

public class Electronics extends Product {
 
		private String manufacturer;
		private ElectCategory subCategory;
		
		public Electronics(String name, String id, int quantity, double price, String manufacturer, ElectCategory subCategory) {
			super(name, id, quantity, price, Category.Electronics);
			this.manufacturer = manufacturer;
			this.subCategory = subCategory;
		}

		@Override
		public void putOnSale(Object id, int percentage) {
			if(getId().equals((String)id)) {
				double price = super.getPrice();
		       	double p1 = price - ( (price * percentage) / 100);	  		
		       	setPrice(p1);
				this.setOnSale(true);
				this.setSalePercent(percentage);
			}
		}
		
		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public ElectCategory getSubCategory() {
			return subCategory;
		}

		public void setSubCategory(ElectCategory subCategory) {
			this.subCategory = subCategory;
		}
		
		public void details() {
			super.details();
			System.out.println("\tManufacturer: "+manufacturer+"\tElect Category: "+subCategory);
		}
//		
//		 enum ElectCategory{
//		HOME_APPLIANCE,
//		KITCHEN_APPLIANCE,
//		ELECTRONIC_DEVICE,
//		ELECTRONIC_ACCESSORY
//		}
		 }