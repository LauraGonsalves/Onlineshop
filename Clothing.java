package application;

public class Clothing extends Product {// make this a subclass of Product
	
		
	
	
		private String brand;
		private SubCategory subCategory;
		private Size size;
		
		public Clothing(String name, String id, int quantity, double price, String brand, SubCategory subCategory, Size size) {
			super(name, id, quantity, price, Category.Cloth);
			this.brand = brand;
			this.subCategory = subCategory;
			this.size = size;
			}
		
		@Override
		public void putOnSale(Object id, int percentage) {
			if (getId().equals((String)id)) {
				double price = super.getPrice();
		       	double p1 = price - ( (price * percentage) / 100);	  		
		       	setPrice(p1);
				this.setOnSale(true);
				this.setSalePercent(percentage);
				}
			}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public SubCategory getSubCategory() {
			return subCategory;
		}

		public void setSubCategory(SubCategory subCategory) {
			this.subCategory = subCategory;
		}

		public Size getSize() {
			return size;
		}

		public void setSize(Size size) {
			this.size = size;
		}

		public void details() {
			super.details();
			System.out.println(" \tBrand: " + brand+ " \tSub Category: " +subCategory+ " \tSize: " +size);
		}


//	enum SubCategory{
//		MEN,
//		WOMEN,
//		KIDS,
//		GIRLS
//	}

//	enum Size{
//		SMALL,
//		MEDIUM,
//		LARGE,
//		XL,
//		XXL
//	}
	}