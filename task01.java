import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class task01 {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}