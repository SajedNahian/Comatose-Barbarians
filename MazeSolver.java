//Solve a given maze
public class MazeSolver{
	
	private static int[] directions = {Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST};


	public static boolean isMazeSolvable(Maze maze) {
		System.out.println(maze);
		if (maze.explorerIsOnA() == Maze.TREASURE) 
			return true;
		
		if (maze.explorerIsOnA() == Maze.WALL) 
			return false;
		
		for (int i = 0; i < directions.length; i++) {
			Maze mazeCopy = new Maze(maze);
			mazeCopy.dropA(Maze.WALL);
			mazeCopy.go(directions[i]);
			if (isMazeSolvable(mazeCopy)) 
				return true;
		}

		return false;	
	}

}
