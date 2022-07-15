package application;

import java.util.ArrayList;


public class Cart {
	
		ArrayList<Product> items= new ArrayList<Product>();
			
		public void addProduct(Product p) {
			 {
			items.add(p);}
		}
		
		public void removeProduct(Product p) {
			removeProduct(p.getId());
		}
		
		public void removeProduct(String id) {
			int index = findProduct(id);
			if(index >= 0) {
				items.remove(index);
			}
		}
		
		public void updateProduct(Product p, int count) {
			updateProduct(p.getId(), count);
		}
		
		public void updateProduct(String id, int count) {
			int index = findProduct(id);
			if(index >= 0) {
				items.get(index).setQuantity(count);
			}
			else {
				System.out.println("Not in Cart.");
			}
		}
		
//		public String viewCart() {
//			for (Product p : items) {
//			return	p.toString();
//			}
//			return "no product is in the cart";
//		}
		public ArrayList<Product> viewCart() {
			ArrayList<Product> temp= new ArrayList<Product>();
			for (Product p : items) {
				temp.add(p);
			}
			return temp;
		}
		
		public void clearCart() {		
			items.clear();
		}

		private int findProduct(String id) { 		 
			for (Product p :items) {
				if(p!=null) {
					if(p.getId().equals(id)) {
						return items.indexOf(p);
					}
					
				}
			}
			return -1;
		}
	}

