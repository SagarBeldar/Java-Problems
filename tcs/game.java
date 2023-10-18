import java.util.HashMap;
import java.util.Map;

public class game {
    public static void main(String[] args) {
        int[] board = new int[101]; 

    
        for (int i = 1; i <= 100; i++)
            board[i] = i;
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();

        snakes.put(17, 7);
        snakes.put(54, 34);
        snakes.put(62, 19);
        snakes.put(98, 79);

        ladders.put(3, 38);
        ladders.put(24, 33);
        ladders.put(42, 93);
        ladders.put(72, 84);

        for (Map.Entry<Integer, Integer> entry : snakes.entrySet())
            board[entry.getKey()] = entry.getValue();

        for (Map.Entry<Integer, Integer> entry : ladders.entrySet())
            board[entry.getKey()] = entry.getValue();

        int currentPosition = 1; 
        int endPosition = 100; 
        int snakesEncountered = 0;
        int laddersEncountered = 0;

        
        while (currentPosition < endPosition) {
        
            int dieRoll = (int) (Math.random() * 6) + 1;

    
            currentPosition += dieRoll;
            if (currentPosition > endPosition)
                currentPosition -= dieRoll;
            if (currentPosition != board[currentPosition]) {
                if (board[currentPosition] < currentPosition)
                    snakesEncountered++;
                else
                    laddersEncountered++;
                currentPosition = board[currentPosition];
            }
        }

        if (currentPosition == endPosition) {
            System.out.println("Possible");
            System.out.println("Number of snakes encountered: " + snakesEncountered);
            System.out.println("Number of ladders encountered: " + laddersEncountered);
            System.out.println("Player's coin has ended at square: " + currentPosition);
        } else {
            System.out.println("Not possible");
            System.out.println("Number of snakes encountered: " + snakesEncountered);
            System.out.println("Number of ladders encountered: " + laddersEncountered);
            System.out.println("Player's coin has ended at square: " + currentPosition);
        }
    }
}