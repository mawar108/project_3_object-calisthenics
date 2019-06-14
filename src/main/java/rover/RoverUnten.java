package rover;

public class RoverUnten extends Rover implements Move{
	private Roverposition roverposition;
	private Mars mars;


	public RoverUnten(Roverposition roverposition, Mars mars) {
			super(roverposition,mars);
			this.mars=mars;
			this.roverposition=roverposition;
			mars.createRover(roverposition,new Objekt("v"));

		}

	@Override
	public void vorwärts() {

		new RoverLöschen(roverposition, mars);
		new RoverUnten(roverposition.PostionPlusRechnen(new Wert(0),new Wert(1)), mars);
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
