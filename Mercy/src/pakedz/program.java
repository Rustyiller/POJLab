package pakedz;

public class program {

	public static void main(String[] args) {
	car samochud = new car("BMW", true, 0, 100000.99);
	car cos = new car("opel");
	samochud.printcar();
	System.out.println("zmieniam wartości");
	samochud.ustawprzebieg(100);
	System.out.println("nowy przebieg: " + samochud.jakiprzebieg());
	cos.printcar();
	}
}
