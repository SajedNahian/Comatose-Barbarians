# Comatose-Barbarians
Maze Solver by Comatose Barbarians 

## personnel
Sajed Nahian and Andrew Wargo
## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure”
if the value is true, what is the solution?
## recursive abstraction
when im asked to solve for a possible path through a maze with n "stepping stones", the recursive abstraction can find possible paths through a maze with n-1 ""stepping stones"
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
## version*n* wish list
