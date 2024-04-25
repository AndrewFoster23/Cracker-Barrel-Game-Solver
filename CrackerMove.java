public class CrackerMove{
  public final int start;
  public final int over;
  public final int end;

  public CrackerMove(int start, int over, int end){
    this.start = start;
    this.over = over;
    this.end = end;
  }

  public String toString(){
    return start + " to " + end + " (remove " + over + ")";
  }

  public static CrackerMove[] allMoves = new CrackerMove[]{
    new CrackerMove(11, 12, 13),
    new CrackerMove(12, 13, 14),
    new CrackerMove(13, 14, 15),
    new CrackerMove(7, 8, 9),
    new CrackerMove(8, 9, 10),
    new CrackerMove(4, 5, 6),

    new CrackerMove(13, 12, 11),
    new CrackerMove(14, 13, 12),
    new CrackerMove(15, 14, 13),
    new CrackerMove(9, 8, 7),
    new CrackerMove(10, 9, 8),
    new CrackerMove(6, 5, 4),


    new CrackerMove(11, 7, 4),
    new CrackerMove(7, 4, 2),
    new CrackerMove(4, 2, 1),
    new CrackerMove(12, 8, 5),
    new CrackerMove(8, 5, 3),
    new CrackerMove(13, 9, 6),

    new CrackerMove(4, 7, 11),
    new CrackerMove(2, 4, 7),
    new CrackerMove(1, 2, 4),
    new CrackerMove(5, 8, 12),
    new CrackerMove(3, 5, 8),
    new CrackerMove(6, 9, 13),


    new CrackerMove(15, 10, 6),
    new CrackerMove(10, 6, 3),
    new CrackerMove(6, 3, 1),
    new CrackerMove(14, 9, 5),
    new CrackerMove(9, 5, 2),
    new CrackerMove(13, 8, 4),

    new CrackerMove(6, 10, 15),
    new CrackerMove(3, 6, 10),
    new CrackerMove(1, 3, 6),
    new CrackerMove(5, 9, 14),
    new CrackerMove(2, 5, 9),
    new CrackerMove(4, 8, 13),
  };

}
