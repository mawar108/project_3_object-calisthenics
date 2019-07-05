package rover;

public class Start {
	public static void main(String[] args){
		Wert x= new Wert(40);
		Wert y= new Wert(10);
		Mars mars= new Mars(x,y);
		//	mars.printMars();
		Roverposition roverposition= new Roverposition(x.WertTeilen(x,new Wert(2)), y.WertTeilen(y,new Wert(2)));
		Rover rover= new RoverOben(roverposition, mars);
		//mars.printMars();
		//rover.vorwärts();
		mars.printMars();

		//rover.rechts();
		//rover.vorwärts();
		//rover.vorwärts();
		//rover.rechts();
		//rover.rechts();

		//mars.printMars();
	}
}
