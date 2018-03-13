package pakedz.zzz;

public class produktkoszyka {
	 Produkt produkt;
	 double obecnaCena;
	 
	 public produktkoszyka(Produkt produkt){
		 this.produkt = produkt;
		 this.obecnaCena = produkt.jakaCena();
	 }
	 
	 public Produkt jakiProdukt(){
		 return produkt;
	 }
	 
	 public void ktoryprodukt(Produkt produkt){
		 this.produkt = produkt;
	 }
	 
	 public double jakaobecnacena(){
		 return obecnaCena;
	 }
	 
	 public void ustawobecnacene(double obecnaCena){
		 this.obecnaCena = obecnaCena;
	 }
	 
	 
}
