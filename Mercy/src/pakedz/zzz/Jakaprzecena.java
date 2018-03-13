package pakedz.zzz;

public class Jakaprzecena implements Przecena{
	@Override
	public boolean CanCalculate(koszyk cart) {
		double koszykBrutto = cart.LacznaCena();
		if (koszykBrutto >= 300)
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(koszyk cart) {
		if (this.CanCalculate(cart)) {
			cart.przecenionasumacen = cart.LacznaCena() * 0.95;
		}
	}

	@Override
	public String toString() {
		return "ValuePromotion [5% off]";
}
}
