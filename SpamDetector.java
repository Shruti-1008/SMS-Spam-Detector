import java.util.*;

public class SpamDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] spam = {"free", "win", "winner", "prize", "offer", "money", "urgent"};

        System.out.print("Enter message: ");
        String msg = sc.nextLine().toLowerCase();

        int score = 0;

        for (String word : spam)
            if (msg.contains(word)) score++;

        if (score >= 2)
            System.out.println("Prediction: SPAM");
        else
            System.out.println("Prediction: NOT SPAM");

        System.out.println("Spam Score: " + score);
    }
}