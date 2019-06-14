package rover;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Objekt {

	private String objekt;

	public Objekt(){
		this.objekt=random();
	}

	public Objekt(String string){
		this.objekt=string;
	}

	private String random(){
		double random = Math.random();
		if (random < 0.25){
			return "#";
		}
		return " ";
	}

	public void printObjekt(){
		OutputStreamWriter buffer= new OutputStreamWriter(System.out);
		BufferedWriter writer= new BufferedWriter(buffer);
		try{
			writer.write(this.objekt);
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

	public void println(){
		OutputStreamWriter buffer= new OutputStreamWriter(System.out);
		BufferedWriter writer= new BufferedWriter(buffer);
		try{
			writer.write('\n');
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