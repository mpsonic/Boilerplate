import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
* An abstract class that implements boilerplate code for reading in
* from a file and outputting to a file. Problem solutions
* should extend the Boilerplate class to define how the input file is
* parsed
*
* Created by Mitchell Paull 2016
*/
public abstract class Boilerplate {

  private String mInputFileName;
  private String mOutputFileName;
  private BufferedReader mInputReader;
  private PrintWriter mOutputWriter;

  // Constructor sets the input and output file names
  public Boilerplate(String inputFileName, String outputFileName) {
    mInputFileName = inputFileName;
    mOutputFileName = outputFileName;
  }

  // Reads the input file line by line and calls
  // parseLine() on each
  public void parseInputFile() {
    try {
      FileReader fr = new FileReader(mInputFileName);
      mInputReader = new BufferedReader(fr);
      mOutputWriter = new PrintWriter(mOutputFileName);
      String line;
      int lineNumber = 0;
      while ((line = mInputReader.readLine()) != null) {
        parseLine(line, lineNumber);
      }
      onFinishedParsingInput();
      mInputReader.close();
      mOutputWriter.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  // Print a line to the output file
  public void outputLine(String line) {
    mOutputWriter.println(line);
    System.out.println("printing to output: " + line);
  }

  // Perform custom code to parse the line with the given lineNumber
  // LineNumbers start at zero.
  public abstract void parseLine(String line, int lineNumber);

  // Called at the end of the parseInputFile function
  // when all of the lines have been parsed.
  public void onFinishedParsingInput() {}
}
