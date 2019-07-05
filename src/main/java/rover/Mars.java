package rover;

public class Mars {

	private Objekt [][] mars;

	public Mars(Wert x, Wert y){
		this.mars= x.Marsgroeße(x,y);
		createMars();
	}

	public Objekt getObjekt(Roverposition roverposition){
		return roverposition.checkPosition(mars,roverposition);
	}

	public void createRover(Roverposition roverposition , Objekt objekt){
		roverposition.createRover(mars,objekt,roverposition);
	}

	private void createMars(){
		for(int i=0; i< this.mars.length; i++){
			createMarsYAchse (i, this.mars[0].length);
		}
	}

	private void createMarsYAchse(int x, int y){
		for(int j=0; j<y; j++){
			this.mars [x][j]=new Objekt();
		}
	}

	public void printMars() {
		for (int i = 0; i < this.mars[0].length; i++) {
			printXMars(this.mars.length, i);
		}
		this.mars[0][0].println();
	}

	private void printXMars(int x, int y){
		for(int j=0; j<x; j++){
			this.mars[j] [y].printObjekt();
		}
		this.mars[0][0].println();
	}
}