package rover;

import java.io.*;

public class Umgebung {
	private String objekt;

	public Umgebung() {
		this.objekt = randomObjekt();
	}

//	public Umgebung(Rover rover){
//		this.objekt= rover;
//	}

	private String randomObjekt(){
		double random = Math.random();
		if (random < 0.25){
			return "#";
		}
		return " ";
	}

	public void printUmgebung() throws IOException {
		BufferedWriter out= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"),512);
		out.write(this.objekt);
		out.flush();
		/*OutputStreamWriter buffer= new OutputStreamWriter(System.out);
		BufferedWriter writer= new BufferedWriter(buffer);
		try{
			writer.write(this.objekt);
		}
		catch (IOException e){
			e.printStackTrace();
		}
		try{
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("Test2");*/

	}


}
