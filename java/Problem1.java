import java.io.PrintWriter;

public class Problem1 extends Boilerplate {

  public Problem1 (String inputFileName, String outputFileName) {
    super(inputFileName, outputFileName);
  }

  // public void parseInputFile()
  // public void outputLine(String line)

  public void parseLine(String line, int lineNumber) {
    // Do stuff with line here
    System.out.println(line);
  }

  // Called when the entire input file has been parsed
  public void onFinishedParsingInput() {
    // To output line to file: outputLine(string);
  }
}
