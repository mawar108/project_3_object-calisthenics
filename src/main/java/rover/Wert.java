package rover;

public class Wert {
	private int wert;

	public Wert(int wert){
		this.wert= wert;
	}

	public Objekt [][] Marsgroeße(Wert x, Wert y){
		return new Objekt[x.wert] [y.wert];
	}

	public Wert WertTeilen(Wert x, Wert y){
		return new Wert(x.wert/y.wert);
	}

	public Wert WertPlus(Wert x, Wert y){
		return new Wert(x.wert+y.wert);
	}

	public void createRover(Objekt mars [][], Wert x, Wert y, Objekt objekt){
		mars[x.wert-1][y.wert-1]=objekt;
	}

	public Objekt checkPosition(Objekt mars [][], Wert x, Wert y){
		return mars [x.wert] [y.wert];
	}

}
