import java.util.*;

public class CrackerBoard{
  int[] spaces = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
  int numPegs = 15;

  public void removeFirstPeg(int remove){
    spaces[remove] = 0;
    numPegs--;
  }

  public boolean canMove(CrackerMove move){
    return spaces[move.start] == 1 && spaces[move.over] == 1
    && spaces[move.end] == 0;

  }

  public void doMove(CrackerMove move){
    spaces[move.start] = 0;
    spaces[move.over] = 0;
    spaces[move.end] = 1;
    numPegs--;
  }

  public void undoMove(CrackerMove move){
    spaces[move.start] = 1;
    spaces[move.over] = 1;
    spaces[move.end] = 0;
    numPegs++;
  }

  public boolean isSolved(){
    return numPegs == 1;
  }

  private String spaceString(int spaceNum){
    int space = spaces[spaceNum];

    if(space == 1){
      String spaces = "";
      spaces += spaceNum;
      return spaces;
    }else if(spaceNum >= 10){
      return " -";
    }else{
      return "-";
    }
  }

  public boolean solvePro(ArrayList<CrackerMove> actualMoves){
    if(isSolved()){
      return true;
    }

    for(CrackerMove mov: CrackerMove.allMoves){
      if(canMove(mov)){
        doMove(mov);
        actualMoves.add(mov);
        if(isSolved()){
          return true;
        }
        if(solvePro(actualMoves)){
          return true;
        }
        undoMove(mov);
        actualMoves.remove(actualMoves.size() - 1);
      }
    }
    return false;
  }

  public boolean isSolvable(){
    ArrayList<CrackerMove> tempMoves = new ArrayList<CrackerMove>();
    if(!solvePro(tempMoves)){
      return false;
    }else{
      while(tempMoves.size() != 0){
        undoMove(tempMoves.remove(tempMoves.size() - 1));
      }
      return true;
    }
  }

  public String toString(){
    String thing = "";
    thing += "       " + spaceString(1) + "\n";
    thing += "     " + spaceString(2) + "  " + spaceString(3) + "\n";
    thing += "    " + spaceString(4) + "  " + spaceString(5) + "  " + spaceString(6) + "\n";
    thing += "  " + spaceString(7) + "  " + spaceString(8) + "  " + spaceString(9) + " " + spaceString(10) + "\n";
    thing += spaceString(11) + " " + spaceString(12) + " " + spaceString(13) + " " + spaceString(14) + " " + spaceString(15);
    return thing;

  }

}
