package rover;

public class RoverOben extends Rover implements Move{

	private Roverposition roverposition;
	private Mars mars;

	public RoverOben(Roverposition roverposition, Mars mars){
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		setRover(new Objekt("^"));
	}

	@Override
	public void vorwärts() {

		new RoverOben(roverposition.PostionPlusRechnen(new Wert(0),new Wert(-1)),mars);
	}

	@Override
	public void rechts() {

	}

	@Override
	public void links() {
		new RoverLinks(roverposition,mars);
	}
}