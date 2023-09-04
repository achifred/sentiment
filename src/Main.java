public class Main {
    public static void main(String[] args) {
        SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
        String text = sentimentAnalyzer.getText() ;
        String sentiment = sentimentAnalyzer.getWordSentiment(text);
        System.out.println("sentiment is : "+ sentiment);

    }
}