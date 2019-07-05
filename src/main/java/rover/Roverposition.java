package rover;

public class Roverposition {
	private Wert x;
	private Wert y;

	public Roverposition(Wert x, Wert y){
		this.x=x;
		this.y=y;
	}

	public Roverposition PostionPlusRechnen(Wert x, Wert y){
		return new Roverposition(x.WertPlus(this.x,x),y.WertPlus(this.y,y));
	}

	public void createRover(Objekt mars [][], Objekt objekt, Roverposition roverposition){
		x.createRover(mars,roverposition.x,roverposition.y,objekt);
	}

	public Objekt checkPosition(Objekt mars [][], Roverposition roverposition){
		return x.checkPosition(mars,roverposition.x,roverposition.y);
	}

}
