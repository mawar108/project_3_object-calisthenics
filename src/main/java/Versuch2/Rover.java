package Versuch2;

public class Rover implements Move{
	private XyKoordinaten roverposition;
	private Mars mars;

	public Rover(XyKoordinaten roverposition, Mars mars){
		this.roverposition=roverposition;
		this.mars=mars;
	}

	public void setRover(Objekt rover){
		mars.setRover(roverposition,rover);
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

