import java.util.HashMap;
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> genresMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            genresMap.put(genres[i], genresMap.getOrDefault(genres[i],0) + plays[i]);

        }
        
        ArrayList<Integer> result = new ArrayList<>();

        
        while (!genresMap.isEmpty()) {
            int max = -1;
            String maxGenre = "";

            for (String genre : genresMap.keySet()) {
                if (genresMap.get(genre) > max) {
                    max = genresMap.get(genre);
                    maxGenre = genre;
                }
            }
            
            int firPlays = -1;
            int secPlays = -1;
            int index = -1;
            int secIndex = -1;

            for (int i = 0; i < genres.length; i++) {

                if (genres[i].equals(maxGenre) && plays[i] > firPlays) {
                    firPlays = plays[i];
                    index = i;
                }
            }
            result.add(index);
            
            for (int j = 0; j < genres.length; j++) {
                if (j == index) {
                    continue;
                }
                
                if (genres[j].equals(maxGenre) && plays[j] > secPlays) {
                    secPlays = plays[j];
                    secIndex = j;
                }
                
            }
            if (secIndex != -1) {
                
                result.add(secIndex);   
            }
            genresMap.remove(maxGenre);

        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i< result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}