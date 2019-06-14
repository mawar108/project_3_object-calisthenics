package rover;

public class RoverOben extends Rover implements Move{
	private Roverposition roverposition;
	private Mars mars;



	public RoverOben(Roverposition roverposition, Mars mars){
		super(roverposition,mars);
		this.mars=mars;
		this.roverposition=roverposition;
		mars.createRover(roverposition,new Objekt("^"));

	}

	@Override
	public void vorwärts() {
		//if (mars.getObjekt(roverposition.PostionPlusRechnen(new Wert(0), new Wert(-1))) == new Objekt("#")) {
			new RoverLöschen(roverposition, mars);
			new RoverOben(roverposition.PostionPlusRechnen(new Wert(0), new Wert(-1)), mars);
		//}
	}


	@Override
	public void rechts() {
		new RoverRechts(roverposition,mars);
	}

	@Override
	public void links() {
		new RoverLinks(roverposition,mars);
	}
}