package rover;

import java.io.*;

public class Mars {

	private Umgebung [][] mars;

	public Mars(int länge){
		this.mars= new Umgebung[länge] [länge];

	}

	public void initMars() throws IOException {
		for(int i=0; i< mars.length; i++){
			forschleife (i, mars[0].length);

		}
	}

	private void forschleife(int x ,int y) throws IOException {
		for(int j=0; j<y; j++){
			this.mars [x][j]=new Umgebung();
		}

	}


	public void println() throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		out.write('\n');
		out.flush();
	}
}
