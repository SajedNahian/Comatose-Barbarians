# Comatose-Barbarians
Maze Solver by Comatose Barbarians 

## personnel
Sajed Nahian and Andrew Wargo
## statement of problem
what is the Boolean value of the statement “it is possible to get from the starting
position to treasure”
if the value is true, what is the solution?
## recursive abstraction
when im asked to solve for a possible path through a maze with n junctions, the recursive abstraction can find possible paths through a maze with n-1 junctions
## base case
The explorer is on the same file and rank as the treasure
## English or pseudocode description of algorithm
First break the maze into nodes or places where you must turn or are given multiple options (to turn or continue). One of these nodes should be the starting node and the other should be the ending node. 

Begin at the start node. Continue down the node until you reach another node meaning you must either be forced to turn or are given options on where to go. 
-In the case of the turn only option, move down that node. And continue the process described above.
-In the case of the multiple options, for each option, continue the process described above.
-In the case that you cannot continue down a node because it is a dead end, end the process being done for that series of nodes.

Once you reach the end node, note the series of nodes you have taken to arrive to the end.
This series will then be converted back into a solution.
## class(es), with fields and methods
## version*n* wish list
