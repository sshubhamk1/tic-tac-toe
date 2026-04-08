import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameHistory {
    List<Map.Entry<Integer,Integer>> steps;
    GameHistory(){
        this.steps = new ArrayList<>();
    }

    void addStep(int currPos, int row, int col){
        if (this.steps.size() > currPos){
            this.steps.set(currPos, new AbstractMap.SimpleEntry<Integer,Integer>(row, col));
        }else {
            this.steps.add(new AbstractMap.SimpleEntry<Integer,Integer>(row, col));
        }
    }

    Map.Entry<Integer, Integer> getValue(int currPos){
        try {
            return this.steps.get(currPos);
        } catch(Exception e) {
            return new AbstractMap.SimpleEntry<Integer,Integer>(5,5);
        }
    }
}
