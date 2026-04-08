import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Board {
    GameHistory history;
    GameSteps boxes;
    List<Player> players;
    int currPos;
    Scanner scan;

    Board() {
        this.history = new GameHistory();
        this.boxes = new GameSteps();
        this.players = new ArrayList<>();
        this.players.add(new Player('O'));
        this.players.add(new Player('X'));
        this.currPos = 0;
        this.scan = new Scanner(System.in);
    }

    void clearLast() {
        Map.Entry<Integer, Integer> entry = this.history.getValue(this.currPos);
        int row = entry.getKey();
        int col = entry.getValue();
        if (row == 5)return;
        this.boxes.clearValue(row, col);
    };

    void addStep(int value, char sign) {
        value -= 65;
        int row = value/ 3;
        int col = value % 3;
        if (this.boxes.getValue(row, col) != '_')return;
        this.boxes.setValue(row, col, sign);
        this.history.addStep(this.currPos, row, col);
        this.currPos = (this.currPos+1) % 8;
    };

    void play() {
        while (true) {
            this.clearLast();
            this.boxes.showBoard();
            this.boxes.showHint(players.get(currPos%2).getSign());
            int value = (int)this.scan.next().charAt(0);
            this.addStep(value, this.players.get(this.currPos % 2).getSign());
            char result = this.boxes.isGameDone();
            if (result != ' '){
                if (players.get(0).getSign() == result){
                    System.out.println("Player " + players.get(0).getSign() + " wins");
                }else {
                    System.out.println("Player " + players.get(1).getSign() + " wins");
                }
                break;
            }
        }
    }
}