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

	public Roverposition PostionMinusRechnen(Wert x, Wert y){
		return new Roverposition(x.WertMinus(this.x,x),y.WertMinus(this.y,y));
	}

	/*public void PostionMinusRechnen(Wert x, Wert y){
		this.x= x.WertMinus(this.x,x);
		this.y= y.WertMinus(this.y,y);
	}*/

	public void createRover(Objekt mars [][], Objekt objekt){
		x.createRover(mars,x,y,objekt);
	}

	public Objekt checkPosition(Objekt mars [][], Roverposition roverposition){
		return x.checkPosition(mars,roverposition.x,roverposition.y);
	}

}
