import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Node {
    short x, y;
    byte dir;

    public Node(short i, short j) {
        this.x = i;
        this.y = j;
        this.dir = 0;
    }
}

public class maze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short m, n;
        int k;
        byte[][] maze;
        byte t = scan.nextByte();
        for (byte i = 0; i < t; i++) {
            n = scan.nextShort();
            m = scan.nextShort();
            maze = new byte[n][m];
            for (byte[] arr : maze)
                Arrays.fill(arr, (byte) 1);
            k = scan.nextInt();
            for (int j = 0; j < k; j++) {
                maze[scan.nextShort() - 1][scan.nextShort() - 1] = 0;
            }
            if (solvable(maze))
                System.out.println("Harry will be killed by lord Voldemort!\n");
            else System.out.println("Harry will be killed by magical traps within the maze!\n");
        }
    }

    static boolean solvable(byte maze[][]) {
        short i = 0, j = 0;
        if (maze[0][0] == 0) return false;
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        for (boolean[] arr : visited)
            Arrays.fill(arr, true);

        Stack<Node> s = new Stack<Node>();
        Node temp = new Node(i, j);
        s.push(temp);

        while (!s.empty()) {

            temp = s.peek();
            byte d = temp.dir;
            i = temp.x;
            j = temp.y;

            temp.dir++;
            s.pop();
            s.push(temp);

            if (i == maze.length - 1 && j == maze[0].length - 1) {
                return true;
            }

            if (d == 0) {

                if (i - 1 >= 0 && maze[i - 1][j] == 1 && visited[i - 1][j]) {
                    Node temp1 = new Node((short) (i - 1), j);
                    visited[i - 1][j] = false;
                    s.push(temp1);
                }
            } else if (d == 1) {

                if (j - 1 >= 0 && maze[i][j - 1] == 1 && visited[i][j - 1]) {
                    Node temp1 = new Node(i, (short) (j - 1));
                    visited[i][j - 1] = false;
                    s.push(temp1);
                }
            } else if (d == 2) {

                if (i + 1 < maze.length && maze[i + 1][j] == 1 && visited[i + 1][j]) {
                    Node temp1 = new Node((short) (i + 1), j);
                    visited[i + 1][j] = false;
                    s.push(temp1);
                }
            } else if (d == 3) {
                if (j + 1 < maze[0].length && maze[i][j + 1] == 1 && visited[i][j + 1]) {
                    Node temp1 = new Node(i, (short) (j + 1));
                    visited[i][j + 1] = false;
                    s.push(temp1);
                }
            } else {
                visited[temp.x][temp.y] = true;
                s.pop();
            }
        }

        return false;
    }
}