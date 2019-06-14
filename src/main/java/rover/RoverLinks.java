package rover;

public class RoverLinks extends Rover implements Move {
	private Roverposition roverposition;
	private Mars mars;

	public RoverLinks(Roverposition roverposition, Mars mars) {
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		mars.createRover(roverposition,new Objekt("<"));

	}
	@Override
	public void vorwärts() {
		if (mars.getObjekt(roverposition.PostionPlusRechnen(new Wert(-1), new Wert(0))) == new Objekt("#")) {
			new RoverLöschen(roverposition, mars);
			new RoverLinks(roverposition.PostionPlusRechnen(new Wert(-1), new Wert(0)), mars);

		}
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


