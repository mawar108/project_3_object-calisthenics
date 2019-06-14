package rover;

public class Wert {
	private int wert;

	public Wert(int wert){
		this.wert= wert;
	}

	public Objekt [][] Marsgröße(Wert x, Wert y){
		return new Objekt[x.wert] [y.wert];
	}

	public Wert WertTeilen(Wert x, Wert y){
		Wert geteilterWert= new Wert(x.wert/y.wert);
		return geteilterWert;
	}

	public Wert WertPlus(Wert x, Wert y){
		Wert plusWert= new Wert(x.wert+y.wert);
		return plusWert;
	}

	public Wert WertMinus(Wert x, Wert y){
		Wert minusWert= new Wert(x.wert-y.wert);
		return minusWert;
	}

	public void createRover(Objekt mars [][], Wert x, Wert y, Objekt objekt){
		mars[x.wert-1][y.wert-1]=objekt;
	}

	public Objekt checkPosition(Objekt mars [][], Wert x, Wert y){
		return mars [x.wert] [y.wert];
	}

}
