import java.util.ArrayList;

public class SimpleStartupTestDrive {
  public static void main(String[] args) {
    SimpleStartup dot = new SimpleStartup();

    int[] locations = {2, 3, 4};
    dot.setLocationCells(locations);

    int userGuess = 2;
    String result = dot.checkYourself(userGuess);

    String testResult = "failed";

    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}

class SimpleStartup {
  private ArrayList<String> locationCells;
  private int numOfHits = 0;

  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  public String checkYourself(String userInput) {
    String result = "miss";

    int index = locationCells.indexOf(userInput);

    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result = "kill";
      } else {
        result = "hit";
      }

    }
    return result;
  }
}
