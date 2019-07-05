package Versuch2;
import java.util.LinkedHashMap;

public class Mars {

	private LinkedHashMap<XyKoordinaten, Objekt> mars;

	public Mars(Wert x, Wert y){
		this.mars= x.Marsgroeße(x,y);
	}

	public void setRover(XyKoordinaten xy, Objekt objekt){
		xy.createRoverXY(mars,objekt,xy, getXy());
	}


	public XyKoordinaten getXy(){
		XyKoordinaten maxXY= new XyKoordinaten();
		for(XyKoordinaten xy: mars.keySet()){
			maxXY= xy;
		}
		return maxXY;
	}

	public void printMars(){
		Wert xCounter= new Wert(0);
		for(XyKoordinaten xy: mars.keySet()){
			Objekt objekt= mars.get(xy);
			objekt.printObjekt();
			getXy().checkLineXY(xCounter);
		}
	}
}