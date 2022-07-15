package application;
import java.io.Serializable;
import java.time.LocalDate;

import java.util.ArrayList;





public class Store implements Serializable {
	
		String name;
		public static  ArrayList<Product> products = new ArrayList<Product>();
		Cart cart = new Cart();

		public Store(String name) {
			this.name=name;
		}

		// ************ Cart related methods *****************

		public void addProductToCart(String id, int amt) throws CloneNotSupportedException { 
			int index = findProduct(id);
			if(index>=0) {
				Product p = (Product) products.get(index).clone();
				if (p.getQuantity()>= amt) {
					p.setQuantity(amt);
					cart.addProduct(p);
					
				}}
				else 
					System.out.println("Out Of Stock");
			
		}

		public void removeProductFromCart(String id) {
			int index = findProduct(id);
			if(index >=0) {
				Product p = products.get(index);
				if(p!=null) {
					cart.removeProduct(id);
				}
			}
		}

		public void updateProductInCart(String id, int count) {
			int index = findProduct(id);
			if(index >=0) {
				Product p = products.get(index);
				if(p!=null) {
					cart.updateProduct(id, count);		
				}
			}
		}

		public void clearCart() {
			cart.clearCart();
		}

		public void payBill() {
			// Iterate through each of the products in the cart and do the following
			// a) reduce those products quantity, 
			// b) If the item is on sale add the salePrice to the bill.
			// c) if not onSale add the totalPrice to bill. 
			// d) Call the clearCart method
			
			double bill = 0;
			for(Product p:cart.items) {
				int index = findProduct(p.getId());
				int quantity = products.get(index).getQuantity() - p.getQuantity();
				products.get(index).setQuantity(quantity);
				
				if(p.isOnSale()) {
					bill += p.salePrice(p.getQuantity());
				}
				else {
					bill += p.totalPrice(p.getQuantity());
				}
			}
			this.clearCart();
			System.out.println("PayBill amout: "+bill+" tk.");
		}
		public double Bill() {
			// Iterate through each of the products in the cart and do the following
			// a) reduce those products quantity, 
			// b) If the item is on sale add the salePrice to the bill.
			// c) if not onSale add the totalPrice to bill. 
			// d) Call the clearCart method
			
			double bill = 0;
			for(Product p:cart.items) {
				int index = findProduct(p.getId());
				int quantity = products.get(index).getQuantity() - p.getQuantity();
				products.get(index).setQuantity(quantity);
				
				if(p.isOnSale()) {
					bill += p.salePrice(p.getQuantity());
				}
				else {
					bill += p.totalPrice(p.getQuantity());
				}
			}
			return bill;
		}
		
	// ***************View related methods *****************

		public void viewProducts(boolean isAdmin) {
//			public ArrayList<Product> viewaProductw(Boolean isAdmin){
//				ArrayList<Product>finalList=
//				new ArrayList<>();
//				if(isAdmin){
//				finalList.addAll(viewProductsAsAdmin(Category.Cloth));
//				finalList.addAll(viewProductsAsAdmin(Category.Electronics));
//				finalList.addAll(viewProductsAsAdmin(Category.Food));
//				}
//				else {
//				finalList.addAll(viewProducts(Category.Cloth));
//				finalList.addAll(viewProducts(Category.Electronics));
//				finalList.addAll(viewProducts(Category.Food));
//				}
//				return finalList;
//				}
//				public ArrayList<Product>viewProducts (category category){
//				ArrayList<Product>templist=new ArrayList <>();
			if(isAdmin) {
				viewProductsAsAdmin(Category.Electronics);
				viewProductsAsAdmin(Category.Cloth);
				viewProductsAsAdmin(Category.Food);
			}
			else {
				viewProducts(Category.Electronics);
				viewProducts(Category.Cloth);
				viewProducts(Category.Food);
			}
		}
			
		public void viewProducts(Category category) {
			for(Product p:products) {
				if(p.getCategory().equals(category )) {
					System.out.println(p);
				}
			}
		}
		
		public ArrayList<Product>  viewProductsFromCart() {
			return cart.viewCart();
		}

		public void viewProductsAsAdmin(Category category) {
			for(Product p:products) {
				if(p.getCategory().equals(category )) {
					p.details();
				}
			}
		}

		// ************* Admin methods to put a item(s) on sale*************
		
		public void putOnSaleFood(Integer expireWithin, int percentage) {
			for (Product p :products) {
				if(p.getCategory().equals(Category.Food)) {
				p.putOnSale(expireWithin, percentage); }
			}
			
		}
		
		public void putOnSaleCloth(String  id, int percentage) {
			int index = findProduct(id);
			products.get(index).putOnSale(id, percentage);
		}
		
		public void putOnSaleElectronic(String  id, int percentage) {
			for (Product p :products) {
				p.putOnSale(id, percentage);
			}
		}
		
		//**********************Admin methods to add items in the store*******************
		
		public void addProduct(String name, String id, int quantity,double price , String b, SubCategory sub, Size size) {
//			addProduct(new Clothing(name, id, quantity, price, b, sub, size));
			
			int index = findProduct(id);
			if(index >=0) {
				Product p = products.get(index);
				Clothing item = (Clothing)p;
				if (item.getBrand().equals(b) && item.getSize().equals(size)&& item.getSubCategory().equals(sub)) {
					item.updateQuantity(quantity);
					return;					
				}
			}	
				products.add(new Clothing(name, id, quantity, price, b, sub, size));
		}
		
		public void addProduct(String name, String id, int quantity, double price, String manufacturer, ElectCategory sub) {
//			addProduct(new Electronics(name, id, quantity, price, manufacturer, sub));
					
			int index = findProduct(id);
			if(index >=0) {
				Product p = products.get(index);
				Electronics item = (Electronics)p;
				if (item.getManufacturer().equals(manufacturer) && item.getSubCategory().equals(sub)) {
					item.updateQuantity(quantity);
					return;					
				}
			}
			products.add(new Electronics(name, id, quantity, price, manufacturer, sub));
		}
		
		public void addProduct(String name, String id, int quantity, double price, LocalDate mfg, LocalDate exp) {
			int index = findProduct(id);
			if(index >=0) {
				Product p = products.get(index);
				FoodItem item = (FoodItem)p;
				if (item.getMfgDate().equals(mfg) && item.getExpirationDate().equals(exp)) {
					item.updateQuantity(quantity);
					return;					
				}
			}
			products.add(new FoodItem(name, id, quantity, price, exp, mfg));
		}
		
		private int findProduct(String id) { 	 
			for (Product p :products) {
				if(p!=null) {
					if(p.getId().equals(id)) {
						return products.indexOf(p);
					}
				}
			}
			return -1;
		}
		
		// the following method is a private method for only Clothing and Electronics/
		private void addProduct(Product p) {
			int index = findProduct(p.getId());
			if(index >= 0) {
				Product pr= products.get(index);
				pr.updateQuantity(p.getQuantity());
			}
			else 
				products.add(p);
		}	
	}