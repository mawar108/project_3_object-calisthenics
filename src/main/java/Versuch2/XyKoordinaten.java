package Versuch2;

import java.util.LinkedHashMap;

public class XyKoordinaten {
	private Wert x;
	private Wert y;

	public XyKoordinaten(Wert x, Wert y){
		this.x=x;
		this.y=y;
	}

	public XyKoordinaten(){
		this.x=new Wert(0);
		this.y=new Wert(0);
	}

	public void xyPlus(Wert x, Wert y){
		this.x.WertPlus(x);
		this.y.WertPlus(y);
	}

	public void checkLineXY(Wert x){
		this.x.checkLine(x);
	}

	public void createRoverXY(LinkedHashMap<XyKoordinaten,Objekt> mars, Objekt objekt, XyKoordinaten xy, XyKoordinaten xyMax){
		Wert maxY= xyMax.x;
		maxY.setRoverWert(mars, objekt, xy.x,xy.y,maxY);
	}


	public void printXY(){
		x.printWert();
		y.printWert();
	}

}

