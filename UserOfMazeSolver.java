/**
  Test MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting

  For example,
      java UserOfMazeSolver mazes/intersection_treasureNorth.txt 1 1
      java UserOfMazeSolver mazes/test.txt 3 0
 */

public class UserOfMazeSolver {
    private static Displayer displayer;

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );
        System.out.println( maze + System.lineSeparator());
        
        solveTest(maze);
    }

    private static void solveTest(Maze mazeToTest) {
    	//MazeSolver i = new MazeSolver();
    	System.out.println(MazeSolver.isMazeSolvable(mazeToTest));
    }
}