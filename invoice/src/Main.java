import model.Product;

public class Main {

		public static void main(String[] args){
		
			Product rzecz = new Product("asdf", "ghjk", 34.0);
			
			System.out.println("Code: " + rzecz.getCode());
			System.out.println("Name: " + rzecz.getName());
			System.out.println("Price: " + rzecz.getPrice());
			
		}
	}


