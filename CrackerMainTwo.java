import java.util.*;

public class CrackerMainTwo{


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    CrackerBoard board = new CrackerBoard();

    System.out.println(board);
    System.out.println();

    System.out.println("Which peg would you like to remove?");
    int peg = input.nextInt();
    System.out.println();
    board.removeFirstPeg(peg);

    while(!board.isSolved()){
      System.out.println(board);
      System.out.println();
      ArrayList<CrackerMove> possibleMoves = new ArrayList<CrackerMove>();

      for(CrackerMove mov: CrackerMove.allMoves){
        if(board.canMove(mov)){
          possibleMoves.add(mov);
        }
      }

      int poss = 1;
      for(CrackerMove mov: possibleMoves){
        System.out.println(poss + ". " + mov);
        poss++;
      }

      System.out.println();
      System.out.println("Which move would you like to make?");
      int moveNum = input.nextInt();

      board.doMove(possibleMoves.get(moveNum - 1));

      if(!board.isSolvable()){
        System.out.println("The move will result in a loss, choose a different move.");
        board.undoMove(possibleMoves.get(moveNum - 1));
      }

    }
    System.out.println("You win!");


  }
}
