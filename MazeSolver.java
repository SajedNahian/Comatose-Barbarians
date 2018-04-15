//Solve a given maze
public class MazeSolver{
	
	// Array of the directions so we can use a foor loop later on.
	private static int[] directions = {Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};


	public static boolean isMazeSolvable(Maze maze) {
		System.out.println(maze);
		// BASE CASES: 

		// If we are on a tresure, we solved the maze!
		if (maze.explorerIsOnA() == Maze.TREASURE) 
			return true;
		
		// If we are on a wall, we cannot solve the maze!
		if (maze.explorerIsOnA() == Maze.WALL) 
			return false;
		
		// For every direction, we make a copy of the maze using the snapshot constructor
		// we drop a wall to prevent the explorer from looping around
		// check if moving in that direction is valid - if it is, the maze can be solved and so we return true
		// if not we continue with the next direction
		for (int i = 0; i < directions.length; i++) {
			Maze mazeCopy = new Maze(maze);
			mazeCopy.dropA(Maze.WALL);
			mazeCopy.go(directions[i]);
			if (isMazeSolvable(mazeCopy)) 
				return true;
		}

		// this will execute if we are in a state where there is no possible move to get to the treaure (if there is treasure)
		// and so we return false
		return false;	
	}

}
