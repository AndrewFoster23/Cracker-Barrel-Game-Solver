import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CrackerMain{

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    CrackerBoard board = new CrackerBoard();

    System.out.println(board);
    System.out.println();

    System.out.println("Which peg would you like to remove?");
    int peg = input.nextInt();
    System.out.println();
    board.removeFirstPeg(peg);

    ArrayList<CrackerMove> actualMoves = new ArrayList<CrackerMove>();

    if(board.solvePro(actualMoves)){
      FileWriter fileWriter = new FileWriter("out.txt");
      PrintWriter printWriter = new PrintWriter(fileWriter);
      for(CrackerMove mov: actualMoves){
        System.out.println(mov);
        printWriter.println(mov);
      }
      printWriter.close();
    }else{
      System.out.println("No solution");
    }
  }
}
