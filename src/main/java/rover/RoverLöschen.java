package rover;

public class RoverLöschen extends Rover implements Move{
	private Roverposition roverposition;
	private Mars mars;



	public RoverLöschen(Roverposition roverposition, Mars mars){
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		mars.createRover(roverposition,new Objekt(" "));

	}



}
