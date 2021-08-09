package Activity5;
import java.util.*;

class SortScore extends Thread {

    @Override
    public void run() {
        String scoreArray[] = scoreString.split(",");

        int scores[] = new int[scoreArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            scores[i] = Integer.parseInt(scoreArray[i]);
        }
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                int tmp = 0;
                if (scores[i] > scores[j]) {
                    tmp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tmp;
                }
            }
        }
        this.scores = scores;
    }

    private String matchType;
    private String scoreString;
    private int[] scores;

    public String getMatchType() {
        return matchType;
    }

    public SortScore(String matchType, String scoreString) {
        this.matchType = matchType;
        this.scoreString = scoreString;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getScoreString() {
        return scoreString;
    }

    public void setScoreString(String scoreString) {
        this.scoreString = scoreString;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

}

public class ThreadMain {
	 static void printArray(SortScore sortScore) {
	        System.out.println("Match: "+ sortScore.getMatchType());
	        int a[] = sortScore.getScores();
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }

	    }

	    public static void main(String[] args) throws InterruptedException {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the Match : ");
	        String matchType1 = scanner.nextLine();
	        System.out.println("Enter the Scores : ");
	        String scores1 = scanner.nextLine();
	        SortScore sortScore1 = new SortScore(matchType1, scores1);
	        sortScore1.start();
	        sortScore1.join();

	        System.out.println("Enter the Match : ");
	        String matchType2 = scanner.nextLine();
	        System.out.println("Enter the Scores : ");
	        String scores2 = scanner.nextLine();
	        SortScore sortScore2 = new SortScore(matchType2, scores2);
	        sortScore2.start();
	        sortScore2.join();
	        System.out.println("Enter the Match : ");
	        String matchType3 = scanner.nextLine();
	        System.out.println("Enter the Scores : ");
	        String scores3 = scanner.nextLine();

	        SortScore sortScore3 = new SortScore(matchType3, scores3);
	        sortScore3.start();
	        sortScore3.join();

	        System.out.println("Ordered Score List ");
	        printArray(sortScore1);
	        printArray(sortScore3);
	        printArray(sortScore2);

	    }
	    
}


/*
ODI 
89,128,113,67,202 
Test  
76,34,75,23,96  
T20 
56,35,75,45,39 
 * 
 */
