package rover;

public class RoverRechts extends Rover implements Move {
	private Roverposition roverposition;
	private Mars mars;

	public RoverRechts(Roverposition roverposition, Mars mars){
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		setRover(new Objekt(">"));

	}


	public void vorwärts() {
		new RoverRechts(roverposition.PostionPlusRechnen(new Wert(1),new Wert(0)),mars);
	}


	public void rechts() {
		super.setRoverposition(roverposition);
		new RoverUnten(roverposition,mars);
	}


	public void links() {

	}
}
