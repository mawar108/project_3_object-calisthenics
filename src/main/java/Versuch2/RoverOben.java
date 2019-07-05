package Versuch2;

public class RoverOben implements RoverI{

	private XyKoordinaten roverposition;
	private Mars mars;

	public RoverOben(XyKoordinaten roverposition, Mars mars){
		//super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		//setRover(new Objekt("^"));
		mars.setRover(roverposition, new Objekt("^"));
	}

	@Override
	public void vorwärts() {
		mars.setRover(roverposition,new Objekt(" "));
		roverposition.xyPlus(new Wert(0), new Wert(-1));
		mars.setRover(roverposition, new Objekt("^"));
	}

	@Override
	public void rechts() {
		new RoverRechts(roverposition,mars);
	}

	@Override
	public void links(){
		new RoverLinks(roverposition,mars);
	}
}