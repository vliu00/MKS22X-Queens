public class VDriver{
  public static void main(String[]args){
    QueenBoard q4 = new QueenBoard(4);
    /*
    QueenBoard q2 = new QueenBoard(0);
    System.out.println(q2.solve());
    System.out.println(q2);
    System.out.println(q2.countSolutions());
    System.out.println(q2);
    */
    /*
    q4.addQueen(1,0);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.addQueen(3,1);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.addQueen(0,2);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.addQueen(2,3);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.removeQueen(2,3);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.removeQueen(0,2);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.removeQueen(3,1);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    q4.removeQueen(1,0);
    System.out.println(q4.toStringUndercover());
    System.out.println();
    */

    /*
    System.out.println("Should be true for the 4x4 board: "); System.out.println(q4.solve()); System.out.println(q4);
    q4 = new QueenBoard(4);
    System.out.println("Should be 2 solutions for the 4x4 board: "); System.out.println(q4.countSolutions());
    System.out.println();
    
    QueenBoard q1 = new QueenBoard(1);
    System.out.println("Should be true for the 1x1 board: "); System.out.println(q1.solve()); System.out.println(q1);
    q1 = new QueenBoard(1);
    System.out.println("Should be 1 solutions for the 1x1 board: "); System.out.println(q1.countSolutions());
    System.out.println();

    QueenBoard q2 = new QueenBoard(2);
    System.out.println("Should be false for the 2x2 board: "); System.out.println(q2.solve()); System.out.println(q2);
    q2 = new QueenBoard(2);
    System.out.println("Should be 0 solutions for the 2x2 board: "); System.out.println(q2.countSolutions());
    System.out.println();
    */
    /*
    QueenBoard q3 = new QueenBoard(3);
    System.out.println("Should be false for the 3x3 board: "); System.out.println(q3.solve()); System.out.println(q3);
    q3 = new QueenBoard(3);
    System.out.println("Should be 0 solutions for the 3x3 board: "); System.out.println(q3.countSolutions()); System.out.println(q3);
    */
    /*
    QueenBoard q5 = new QueenBoard(5);
    //System.out.println("Should be true for the 5x5 board: "); System.out.println(q5.solve()); System.out.println(q5);
    //q5 = new QueenBoard(5);
    System.out.println("Should be 10 solutions for the 5x5 board: "); System.out.println(q5.countSolutions());
    */
    
    QueenBoard q14 = new QueenBoard(14);
    System.out.println("Should be true for the 14x14 board: "); System.out.println(q14.solve()); System.out.println(q14);
    q14 = new QueenBoard(14);
    System.out.println("Should be 365596 solutions for the 8x8 board: "); 
    long startMS = System.currentTimeMillis();
    System.out.println(q14.countSolutions());
    long endMS = System.currentTimeMillis();
    long diffMS = endMS - startMS;
    System.out.println("numSeconds: "+diffMS/1000.0);
    
    /*
    QueenBoard q10 = new QueenBoard(10);
    System.out.println(q10.solve()); System.out.println(q10);
    q10 = new QueenBoard(10);
    System.out.println(q10.countSolutions()); System.out.println(q10);
    */
    /*
    QueenBoard q16 = new QueenBoard(16);
    System.out.println(q16.countSolutions());
    */
    QueenBoard q0 = new QueenBoard(0);
    System.out.println(q0.countSolutions());
    System.out.println(q0.solve());
  }
  //i have tested zero sized boards... now to test other sized boards
}
