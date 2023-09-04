import java.util.Objects;
import java.util.Scanner;

public class SentimentAnalyzer {

    public String getWordSentiment(String text) {

        if (Objects.isNull(text) || text.length() < Constants.MIN_TEXT_LENGTH){
            return "sorry invalid text. Text must be at least 3 length ";
        }

        String[] words = extractText(text);
        double badWordOccurrenceCount = getBadWordOccurrenceCount(words);
        double sentimentPercentile = getPercentile(badWordOccurrenceCount,words.length);

        return getSentiment(sentimentPercentile);
    }

    public String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");

        return scanner.nextLine();

    }

    private String[] extractText(String text) {

        return text.split(Constants.DELIMITER_REGEX);
    }

    private double getPercentile(double badWordCount, double OriginalTextCount) {

        return (badWordCount/OriginalTextCount) * Constants.PERCENTAGE_MULTIPLIER;
    }

    private double getBadWordOccurrenceCount(String[] words) {
        double numberOfBadWords = 0;
        for (String word:words) {
            if (Constants.BAD_WORDS.contains(word.toLowerCase())) {
                numberOfBadWords = numberOfBadWords + 1;
            }
        }
        return numberOfBadWords;
    }

    private String getSentiment(double intensity) {

        if (intensity <=5) return Constants.POSITIVE_SENTIMENT;
        if (intensity < 20) return Constants.NEUTRAL_SENTIMENT;

        return Constants.NEGATIVE_SENTIMENT;
    }
}
