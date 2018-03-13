package pakedz.zzz;

import java.util.ArrayList;

public class koszyk {
	ArrayList<produktkoszyka> rzeczy = new ArrayList<>();
	ArrayList<Przecena> przeceny = new ArrayList<>();
	double przecenionasumacen = 0;
	
	public double LacznaCena(){
		double suma = 0;
		for(produktkoszyka to : rzeczy)
			suma+= to.jakiProdukt().jakaCena();
		return suma;
	}
	
	public ArrayList<produktkoszyka> jakieRzeczy(){
		return rzeczy;
	}
	

	public koszyk addProdukt(Produkt p) {
		rzeczy.add(new produktkoszyka(p));
		przecenionasumacen += p.jakaCena(); 
		return this;
	}
	
	public koszyk addPromotion(Przecena p) {
		przeceny.add(p);
		return this;
	}
	
	public koszyk applyPromotions(){
		for(Przecena p : przeceny){
			p.CalculateOffer(this);
		}
		return this;
	}

}