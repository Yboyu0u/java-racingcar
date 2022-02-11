package calculator;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    private static final String NORMAL_DELIMITER = "[,:]";
    private static final String CUSTOM_DELIMITER = "//(.)\n(.*)";

    public static int splitAndSum(final String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        return sum(toInts(split(text)));
    }

    private static String[] split(final String text) {
        final Matcher matcher = Pattern.compile(CUSTOM_DELIMITER).matcher(text);
        if (matcher.find()) {
            final String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }

        return text.split(NORMAL_DELIMITER);
    }

    private static List<NaturalNumber> toInts(final String[] values) {
        return Arrays.stream(values)
            .map(NaturalNumber::new)
            .collect(toList());
    }

    private static int sum(final List<NaturalNumber> numbers) {
        return numbers.stream()
            .mapToInt(NaturalNumber::get)
            .sum();
    }
}
