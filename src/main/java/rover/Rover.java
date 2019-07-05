package rover;

public class Rover implements Move{
	private Roverposition roverposition;
	private Mars mars;

	public Rover(Roverposition roverposition, Mars mars){
		this.roverposition=roverposition;
		this.mars=mars;
	}

	public void setRover(Objekt objekt){
		mars.createRover(roverposition,objekt);
	}

	public void setRoverposition(Roverposition roverposition){
		this.roverposition=roverposition;
	}

	@Override
	public void vorwärts() {
	}

	@Override
	public void rechts() {
	}

	@Override
	public void links() {
	}
}

