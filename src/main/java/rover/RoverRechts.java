package rover;

public class RoverRechts extends Rover implements Move {
	private Roverposition roverposition;
	private Mars mars;

	public RoverRechts(Roverposition roverposition, Mars mars){
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		mars.createRover(roverposition,new Objekt(">"));

	}


	public void vorwärts() {

	}


	public void rechts() {

	}


	public void links() {

	}
}
