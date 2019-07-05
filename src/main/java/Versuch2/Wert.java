package Versuch2;

import java.awt.image.Kernel;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;

public class Wert {
	private int wert;

	public Wert(int wert){
		this.wert= wert;
	}

	public LinkedHashMap<XyKoordinaten, Objekt> Marsgroeße(Wert x, Wert y){
		LinkedHashMap<XyKoordinaten, Objekt> mars= new LinkedHashMap<>();
		Wert xCounter=new Wert(0);
		Wert yCounter= new Wert(0);
		for(int i=0; i<(x.wert*y.wert); i++){
			mars.put(new XyKoordinaten(xCounter, yCounter), new Objekt());
			CounterZeile(x,xCounter, yCounter);
		}
		return mars;
	}

	private void CounterZeile(Wert x, Wert xCounter, Wert yCounter){
		if(xCounter.wert>=x.wert){
			xCounter.wert=0;
			yCounter.wert++;
		}
		xCounter.wert++;
	}

	public void WertPlus(Wert x){
		wert= wert+x.wert;
	}

	public void setRoverWert(LinkedHashMap<XyKoordinaten, Objekt> mars, Objekt objekt, Wert x, Wert y, Wert yMax){
		Wert counter= new Wert(0);
		for(XyKoordinaten xy: mars.keySet()){
			check(counter,xy,mars,objekt,x,y,yMax);
		}
	}

	public void check(Wert counter, XyKoordinaten xy, LinkedHashMap<XyKoordinaten , Objekt> mars, Objekt objekt, Wert x, Wert y, Wert maxY){
		if(counter.wert== x.wert+y.wert*maxY.wert){
			mars.put(xy,objekt);
		}
		counter.wert++;
	}

	public void checkLine(Wert x){
		x.wert++;
		Objekt objekt = new Objekt();
		if(x.wert>=this.wert){
			objekt.println();
			x.wert=0;
		}
	}

	public void printWert(){
		OutputStreamWriter buffer= new OutputStreamWriter(System.out);
		BufferedWriter writer= new BufferedWriter(buffer);
		try{
			writer.write(Integer.toString(this.wert));
		}
		catch (IOException e){
			e.printStackTrace();
		}
		try{
			writer.flush();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
