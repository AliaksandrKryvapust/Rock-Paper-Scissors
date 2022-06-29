import java.util.Arrays;
import java.util.List;

public class Source {
    public static void main(String[] args) {
        String p1 = "rock";
        String p2 = "scissors";
        System.out.println(rps(p1,p2).equals("Player 1 won!"));
    }
    public static String rps(String p1, String p2) {
        List<String> temp = Arrays.asList("scissors","paper","rock");
        if (p1.equals(p2))
            return "Draw!";
        else if (p1.equals(temp.get(0)) && p2.equals(temp.get(1)) ||
                p1.equals(temp.get(1)) && p2.equals(temp.get(2)) ||
                p1.equals(temp.get(2)) && p2.equals(temp.get(0)))
        {
            return "Player 1 won!";
        }
        else return "Player 2 won!";
    }
}
