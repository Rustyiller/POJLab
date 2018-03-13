package pakedz.zzz;

public class Produkt {
	String nazwa;
	double cenaproduktu;
	double cenaprzecena;
	
	public String jakaNazwa(){
		return nazwa;
	}
	
	public void ustalNazwe(String nazwa){
		this.nazwa = nazwa;
	}
	
	public double jakaCena(){
		return cenaproduktu;
	}
	
	public void ustalCene (double cenaproduktu){
		this.cenaproduktu = cenaproduktu;
	}
	
	public double jakacenaprzecena(){
		return cenaprzecena;
	}
	
	public void ustalcenaprzecena(double cenaprzecena){
		this.cenaprzecena = cenaprzecena;
	}
	
	public Produkt(String nazwa, double cenaproduktu){
		this.nazwa = nazwa;
		this.cenaproduktu = cenaproduktu;
	}
	
	public void PrzeProdukt(String nazwa, double cenaprzecena){
		this.nazwa = nazwa;
		this.cenaprzecena = cenaprzecena;
	}
	
}