package gamee;

import java.util.Scanner;

import static gamee.Game.addNumber;
import static gamee.Game.board;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String move;
        boolean isContinue = true;
        Game game = new Game();
        game.initialize_board();
        while (isContinue) {
            game.show_board();
            System.out.println("Enter w/a/s/d \n" +
                               "If you want to exit game enter q");
            move = sc.nextLine();
            switch (move) {
                case "d":moveRight();

            }
        }


    }

    public static void moveUp(int[][] board) {
    }


    static void moveRight() {
        for (int i = 0; i < 4; i++) {
            int empty = 4 - 1;
            for (int j = 4 - 1; j >= 0; j--) {
                if (board[i][j] != 0) {
                    int value = board[i][j];
                    board[i][j] = 0;
                    board[i][empty] = value;
                    empty--;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 4 - 2; j >= 0; j--) {
                if (board[i][j] == board[i][j + 1]) {
                    board[i][j + 1] *= 2;
                    board[i][j] = 0;
                }


            }
        }
        addNumber();
    }


}