//Solve a given maze
public class MazeSolver{
	
	public MazeSolver() {

	}

	public static boolean isMazeSolvable(Maze current) {
		System.out.println(current);
		if (current.explorerIsOnA() == Maze.TREASURE) {
			return true;
		} 
		if (current.explorerIsOnA() == Maze.WALL) {
			return false;
		}
		
		Maze snapshot = new Maze(current);
		current.dropA(Maze.WALL);

		current.go(Maze.SOUTH);
		if (isMazeSolvable(current)) {
			return true;
		}
		current = snapshot;

		current.go(Maze.NORTH);
		if (isMazeSolvable(current)) {
			return true;
		}
		current = snapshot;

		current.go(Maze.EAST);
		if (isMazeSolvable(current)) {
			return true;
		}
		current = snapshot;


		current.go(Maze.WEST);
		if (isMazeSolvable(current)) {
			return true;
		}
		//current = snapshot;

		return false;
		}
		
	}
