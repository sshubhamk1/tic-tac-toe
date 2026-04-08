public class GameSteps {
    char [][]board;
    GameSteps(){
        this.board = new char[3][3];
        for (int i = 0; i < 3; ++i )
        {
            for (int j = 0; j < 3; ++j)
            {
                this.board[i][j] = '_';
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j)
            {
                if (this.board[i][j] == '_'){
                    System.out.print((char)(i*3+j + 65)+ " ");
                }else System.out.print((char)this.board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void showHint(char sign) {
        System.out.println("Enter the value (other than 'O' and 'X' to enter [" + sign + "] : ");
    }

    public char isGameDone() {
        for (int i = 0; i < 3; ++i){
            if (this.board[i][0] != '_' && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2]){
                System.out.println("Winner is " + (char)this.board[i][0]);
                return this.board[i][0];
            }
        }
        for (int j = 0; j < 3; ++j)
        {
            if (this.board[0][j] != '_' && this.board[0][j] == this.board[1][j] && this.board[1][j] == this.board[2][j]){
                System.out.println("Winner is " + this.board[0][j]);
                return this.board[0][j];
            }
        }
        if (this.board[0][0] != '_' && this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]){
            System.out.println("Winner is " + this.board[0][0]);
                return this.board[0][0];
        }
        if (this.board[0][2] != '_' && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]){
            System.out.println("Winner is " + this.board[0][2]);
                return this.board[0][2];
        }

        return ' ';
    }

    public void clearValue(int row, int col) {
        this.board[row][col] = '_';
    }

    public void setValue(int row, int col, char sign) {
        this.board[row][col] = sign;
    }

    public char getValue(int row, int col) {
        return this.board[row][col];
    }
    
}
