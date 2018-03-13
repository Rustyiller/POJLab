package pakedz;

import java.util.ArrayList;

import pakedz.zzz.*;

public class Main {
	public static ArrayList<Produkt> przykladProduktu(int n) {
		ArrayList<Produkt> przyklad = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Produkt p = new Produkt("Produkt " + i, i * 25);
			przyklad.add(p);
		}
		return przyklad;
}
	public static koszyk przykladKoszyk() {
		koszyk c = new koszyk();
		for (Produkt p : przykladProduktu(10)) {
			c.addProdukt(p);
		}
		return c;
}
	public static void main(String[] args) {
		// System.out.println(getSampleCart().getItems());
		koszyk cart = new koszyk();
		cart.addProdukt(new Produkt("Kartofle", 200))
		    .addProdukt(new Produkt("Gazeta", 100))
		    .addPromotion(new Jakaprzecena())
		    .applyPromotions();

		System.out.println(cart);

	//	cart.addPromotion(new MugPromotion())
		//    .applyPromotions();

		//System.out.println(cart);
}
}
