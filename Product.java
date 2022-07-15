package application;

import java.io.Serializable;


public abstract class Product implements Cloneable,Serializable{
	
		

		private String name, id;
		private Category category;
		private int quantity;
		private double price;
		private boolean onSale;
		private int salePercent;
		
		public Product(String name, String id, int quantity, double price, Category category) {
			
			this.name = name;
			this.id = id;
			this.category = category;
			this.quantity = quantity;
			this.price = price;
		}
		
		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public boolean isOnSale() {
			return onSale;
		}

		public void setOnSale(boolean onSale) {
			this.onSale = onSale;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public void updateQuantity(int quantity) {
			this.quantity += quantity;
		}

		public int getSalePercent() {
			return salePercent;
		}

		public void setSalePercent(int salePercent) {
			this.salePercent = salePercent;
		}

		public String getName() {
			return name;
		}

		public String getId() {
			return id;
		}

		public double totalPrice(int amt) {
			return amt*price;
		}

		public double salePrice(int amt) {
			return amt*price*((100-salePercent)/100.0);
		}
		public abstract void putOnSale(Object criterion, int percentage);

//		@Override
//		public String toString() {
//			if (!onSale)
//				return  String.format("NAME : %s  ID :  %s  PRICE : %.1f tk", name,id,price);
//			else
//				return  String.format("NAME : %s  ID : %s  ON SALE : %f tk(Original Price:%d)", name,id,price, salePrice(1));
//		}
//		
		@Override
		public String toString() {
			if (!onSale)
				return  String.format("NAME : " + name +  " \tID : " + id +  " \tQUANTITY : " + quantity +  " \tPRICE : "
						+ getPrice() + " \tCATEGORY : " + category +  " \tOnSALE : " + onSale + " \tSALE PERCENT : " + salePercent);
			else
				return  String.format("NAME : " + name + " \tID : " + id + " \tQUANTITY : " + quantity + " \tPRICE : "
						+ getPrice() + " \tCATEGORY : " + category +  " \tOnSALE : " + onSale + " \tSALE PERCENT : " + salePercent);
		}
		
		public void details() {
			System.out.print("Name: " + name + " \tID: " + id + " \tQuantity: " + quantity + " \tPrice: "
					+ getPrice() + " \tCategory: " + category +  " \tonSale: " + onSale + " \tSale Percent: " + salePercent);
		}
		
//		public double  bill() {
//			return getPrice();
//		}
		
		
		
		public Object clone()throws CloneNotSupportedException{  
			return super.clone();  
		}
	}
enum Category{
		Food,
		Cloth,
		Electronics
	}