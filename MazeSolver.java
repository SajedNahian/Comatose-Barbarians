//Solve a given maze
public class MazeSolver{
	
	private int[] directions = {Maze.EAST, Maze.NORTH, Maze.WEST, Maze.SOUTH};
	
	public MazeSolver() {
	}

	public boolean isMazeSolvable(Maze current) {
	    
		if(current.explorerIsOnA() == Maze.TREASURE)
			return true;
		if(current.explorerIsOnA() == Maze.WALL)
			return false;
       
		current.dropA(Maze.WALL);
		
		for(int direction : directions) {
		    Maze snapshot = new Maze(current);
		    System.out.println(snapshot);
		    snapshot.go(direction);
		    if(isMazeSolvable(snapshot))
		        return true;
		}
		
		return false;
		}
		
	}
