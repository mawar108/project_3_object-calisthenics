package Versuch2;

public class RoverLinks implements RoverI {
	private XyKoordinaten roverposition;
	private Mars mars;

	public RoverLinks(XyKoordinaten roverposition, Mars mars) {
		//super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		//setRover(new Objekt("<"));

	}
	@Override
	public void vorwärts() {
		mars.setRover(roverposition,new Objekt(" "));
		roverposition.xyPlus(new Wert(-1), new Wert(0));
		mars.setRover(roverposition, new Objekt("<"));
	}
	@Override
	public void rechts() {
		new RoverOben(roverposition,mars);
	}

	@Override
	public void links() {
		new RoverUnten(roverposition,mars);
	}
}


