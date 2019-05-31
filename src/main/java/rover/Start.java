package rover;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Start {

  public static void main(String[] args) throws IOException {
    Mars mars= new Mars(2);
    mars.initMars();
  }

}
