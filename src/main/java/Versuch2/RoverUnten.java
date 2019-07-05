package Versuch2;

public class RoverUnten implements RoverI{
	private XyKoordinaten roverposition;
	private Mars mars;


	public RoverUnten(XyKoordinaten roverposition, Mars mars) {
			//super(roverposition,mars);
			this.mars=mars;
			this.roverposition=roverposition;
			//setRover(new Objekt("v"));

		}

	@Override
	public void vorwärts() {
		mars.setRover(roverposition,new Objekt(" "));
		roverposition.xyPlus(new Wert(0), new Wert(1));
		mars.setRover(roverposition, new Objekt("v"));

	}

	@Override
	public void rechts() {
		new RoverLinks(roverposition,mars);
	}

	@Override
	public void links() {
		new RoverUnten(roverposition,mars);
	}
}
