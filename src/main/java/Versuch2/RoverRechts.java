package Versuch2;

public class RoverRechts implements RoverI {
	private XyKoordinaten roverposition;
	private Mars mars;

	public RoverRechts(XyKoordinaten roverposition, Mars mars){
		//super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		//setRover(new Objekt(">"));
		mars.setRover(roverposition,new Objekt(">"));
	}


	public void vorwärts() {
		mars.setRover(roverposition,new Objekt(" "));
		roverposition.xyPlus(new Wert(1), new Wert(0));
		mars.setRover(roverposition, new Objekt(">"));
	}


	public void rechts() {
		new RoverUnten(roverposition,mars);
	}


	public void links() {
		new RoverOben(roverposition,mars);
	}
}
