import java.util.List;

public class Constants {
    public static final String NEGATIVE_SENTIMENT = "NEGATIVE";
    public static final String POSITIVE_SENTIMENT = "POSITIVE";
    public static final String NEUTRAL_SENTIMENT = "NEUTRAL";
    public static final int MIN_TEXT_LENGTH = 3;
    public static final int PERCENTAGE_MULTIPLIER = 100;
    public static final List<String> BAD_WORDS = List.of("bad", "ugly", "terrible", "awful", "stupid", "mad", "angry", "sad");

    public static final String DELIMITER_REGEX = "[ ,.!]+";
}
