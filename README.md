**Lord Voldemort and Harrypotter maze game**
**Description

Lord Voldemort wants to play a fake maze game with Harry Potter and kill him.
harry enters to maze from (1,1) cell and he wants to reach to (n,m) cell. There are deadly traps along the way. If the maze isn't solvable, in the output will be written "Harry will be killed by magical traps within the maze!" and if maze is solvable, Voldemort is ambushed in the last cell and will kill Harry. so in the output will be written "Harry will be killed by lord Voldemort!".
The program in the input takes number of mazes and each maze attributes and in the output gives the result of each situation.
for example:
Input:
3     *(number of mazes)*
5 5 1 *(first maze is 5 * 5 and has 1 trap)*
1 1   *(Coordinate of first maze's trap)*
5 5 2 *(second maze is 5 * 5 and has 2 traps)*
4 5   *(Coordinate of second maze's first trap)*
5 4   *(Coordinate of second maze's second trap)*
5 5 4 *...*
2 2   *...*
1 2   *...*
3 3   *...*
4 4   *...*

Output:
Harry will be killed by magical traps within the maze! *(first maze isnt solvable and Harry couldn't get out of it)*
Harry will be killed by magical traps within the maze! *(second maze isnt solvable and Harry couldn't get out of it)*
Harry will be killed by lord Voldemort!                *(third maze is solvable and Harry reached the last cell and Lord killed him)*

## Repo structure
- [src](./src) contains a java class that implemented this project.
