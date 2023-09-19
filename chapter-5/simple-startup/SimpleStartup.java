class SimpleStartup {
  int[] locationCells;
  int numberOfHits = 0;
  
  public String checkYourself(int guess) {
    String result = "miss";
    
    for (int cell : locationCells) {
      if (cell == guess) {
        result = "hit";
        numberOfHits++;
        break;
      }
    }
    
    if (numberOfHits == locationCells.length) {
      result = "kill";
    }
    
    System.out.println(result);
    
    return result;
  }
}
