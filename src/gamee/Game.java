package gamee;

public class Game {
    public static int [][] board=new int[4][4];
    public void initialize_board(){
        for (int i = 0; i < 2; i++) {
            int x=(int)(Math.random()*4);
            int y=(int)(Math.random()*4);
            board[x][y]=2;
        }
    }
    public void show_board(){
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+board[i][j]+"]");
            }
            System.out.println();

        }
    }
    public static void addNumber(){
        int x,y;
        do {
            x = (int) (Math.random() * 4);
            y = (int) (Math.random() * 4);
        } while (board[x][y] != 0);
        board[x][y]=2;
    }
}
