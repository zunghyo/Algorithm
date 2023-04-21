package lecture.stack_queue.Quiz3_크레인인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int k : moves) {
            for (int j = 1; j <= n ; j++) {
                if(board[j][k] != 0) {
                    if(stack.isEmpty() || stack.peek() != board[j][k])
                        stack.push(board[j][k]);
                    else{
                        stack.pop();
                        answer+=2;
                    }
                    board[j][k] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = in.nextInt();

        System.out.println(T.solution(n, board, m, moves));
    }
}
