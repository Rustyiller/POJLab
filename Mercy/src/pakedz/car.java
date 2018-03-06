package pakedz;

public class car {
	String marka;
	boolean czyNowy;
	int przebieg;
	double cena;
	void printcar(){
		System.out.println("Marka: " + marka);
		System.out.println("Nowy: " + czyNowy);
		System.out.println("Przebieg: " + przebieg);
		System.out.println("Cena: " + cena);
	}
	
	car(){
		System.out.println("Inicjacja z nowego konstruktora");
	}
	car(String marka){
		this.marka=marka;
	}
	car(String marka, boolean czyNowy, int przebieg, double cena){
		this(marka);
		this.czyNowy = czyNowy;
		this.przebieg = przebieg;
		this.cena = cena;
	}
	
	public String getmarka(){
		return marka;
	}
	public boolean czyNowy(){
		return czyNowy;
	}
	public void ustawNowy(boolean czyNowy){
		this.czyNowy = czyNowy;
	}
	public int jakiprzebieg(){
		return przebieg;
	}
	public void ustawprzebieg(int przebieg){
		this.przebieg = przebieg;
	}
	public double jakacena(){
		return cena;
	}
	public void ustawcene(double cena){
		this.cena = cena;
	}

public static void main(String[] args) {
	System.out.println("No witam");
	
	car samochud = new car();
}
}