package Versuch2;

public class Start {
	public static void main(String[] args){
		Wert x= new Wert(40);
		Wert y= new Wert(10);
		Mars mars= new Mars(x,y);

		XyKoordinaten xy= mars.getXy();
		XyKoordinaten test= new XyKoordinaten(new Wert(10), new Wert(10));
		test.xyPlus(new Wert(-1), new Wert(0));
	//	test.printXY();
	//	xy.printXY();
	//	mars.printMars();
	//	Rover rover = new RoverOben(new XyKoordinaten(new Wert(19), new Wert(4)), mars);
		RoverI roverI= new RoverOben(new XyKoordinaten(new Wert(19), new Wert(4)), mars);
		mars.printMars();
		roverI.vorwärts();
		roverI.rechts();
	//	roverI.links();
		roverI.vorwärts();
		mars.printMars();

		//rover.rechts();
		//rover.vorwärts();
		//rover.vorwärts();
		//rover.rechts();
		//rover.rechts();

		//mars.printMars();
	}
}
