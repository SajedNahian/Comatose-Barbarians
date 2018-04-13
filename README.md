# Comatose-Barbarians
Maze Solver by Comatose Barbarians 

## personnel
Sajed Nahian and Andrew Wargo
## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure”
## recursive abstraction
when im asked 

  the Boolean value of the statement “it is possible to get from the starting
position to treasure”
  
the recursive abstraction 
  
  can move the starting position by one stepping stone and then return the Boolean value of the statement “it is possible to get from the starting position to treasure”
## base case
If the explorer is on the treasure, return true.

If the explorer is on a wall, return false.
## English or pseudocode description of algorithm
Drop a wall onto the current position of the explorer.

If the explorer isn't on the west edge of the maze, and if the recursive abstraction with the explorer one step to the west returns true, return true.

Then if the explorer isn't on the north edge of the maze, and if the recursive abstraction with the explorer one step to the north returns true, return true.

Then if the explorer isn't on the east edge of the maze, and if the recursive abstraction with the explorer one step to the east returns true, return true.

Then if the explorer isn't on the south edge of the maze, and if the recursive abstraction with the explorer one step to the south returns true, return true.

Return false.
## class(es), with fields and methods
Class Maze -

int TREASURE, WALL, STEPPINGSTONE, EAST, WEST, NORTH, SOUTH

int[][] maze
    
final int MAX_RANKS = 64

int rankCount  
    
Vector explorerPosition  

Maze( String sourceFilename, int explorerRank, int explorerFile)

Maze( Maze old)

toString()

go(int direction)

dropA(int mazeElement)

explorerIsOnA()



Class MazeSolver -

MazeSolver()

isMazeSolvable(Maze current)




Class UserOfMazeSolver -

main(String[] commandLine)

solveTest(Maze x)



Class UserOfMaze - 



## version1 wish list
Fix vertical movement bug
Return a single maze that shows the path taken by the explorer

## known bugs
When the explorer attempts to leave the maze through the north or south, there is a null pointer exception.
