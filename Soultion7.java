import java.util.List;
import java.util.stream.IntStream;

class Solution7 {
    public boolean validWordSquare(List<String> words) {
        return IntStream.range(0, words.size())
                .allMatch(i -> words.get(i).equals(verticalRepresentation(words, i)));
    }

    private String verticalRepresentation(List<String> words, int col){
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (col < word.length()) {
                sb.append(word.charAt(col));
            }
        }
        return sb.toString();
    }
}