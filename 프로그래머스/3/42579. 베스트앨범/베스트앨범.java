
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genresMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genresMap.put(
                genres[i],
                genresMap.getOrDefault(genres[i], 0) + plays[i]
            );
        }

        ArrayList<Integer> answer = new ArrayList<>();

        while (!genresMap.isEmpty()) {

            int max = -1;
            String maxGenre = "";

            for (String genre : genresMap.keySet()) {
                if (genresMap.get(genre) > max) {
                    max = genresMap.get(genre);
                    maxGenre = genre;
                }
            }

            int first = -1;
            int second = -1;

            for (int i = 0; i < genres.length; i++) {

                if (!genres[i].equals(maxGenre)) {
                    continue;
                }

                if (first == -1 || plays[i] > plays[first]) {
                    second = first;
                    first = i;
                } else if (second == -1 || plays[i] > plays[second]) {
                    second = i;
                }
            }

            if (first != -1) {
                answer.add(first);
            }

            if (second != -1) {
                answer.add(second);
            }

            genresMap.remove(maxGenre);
        }

        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
