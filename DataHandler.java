package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataHandler {
	 
		static File file = new File ("Cart.txt");

		public static void saveData(Store c) {
			ObjectOutputStream oos;
			try {
				
				
				oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(c);
				oos.close();
				}
			catch(IOException e) {
				e.printStackTrace();
				}
		}
		public static Store loadData() throws ClassNotFoundException, IOException {
			ObjectInputStream ois = null;
			try {
				ois= new ObjectInputStream(new FileInputStream(file));
				Store b = (Store)ois.readObject();
				ois.close();
				return b;
				} catch (IOException e) {
					e.printStackTrace();
			} 
		Store b = (Store) ois.readObject();
			return null;
		}
		}

