import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int n = genres.length;
        
        Map<String, Integer> genresMap = new HashMap<>();
        Map<String, ArrayList<Song>> playsMap = new HashMap<>();
        
        int max = 0;
        for(int i=0; i<n; i++){
            String genre = genres[i];
            int play = plays[i];
            
            genresMap.put(genre, genresMap.getOrDefault(genre, 0)+play);
            if(!playsMap.containsKey(genre)){ 
                playsMap.put(genre, new ArrayList());
            }
            playsMap.get(genre).add(new Song(i, play));
        }
        
        ArrayList<String> genresList = new ArrayList<>(genresMap.keySet());
        genresList.sort((a,b) -> genresMap.get(b)-genresMap.get(a));
        
        ArrayList<Integer> answerList = new ArrayList<>();
        for(String x: genresList){
            ArrayList<Song> songList = new ArrayList<>(playsMap.get(x));
            Collections.sort(songList);
            int cnt = 0;
            for(Song song: songList){
                if(cnt++ ==2) break;
                answerList.add(song.idx);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
                  
}
                                  
class Song implements Comparable<Song>{
    int idx;
    int play;

    public Song(int idx, int play){
        this.idx = idx;
        this.play = play;
    }

    @Override
    public int compareTo(Song song){
        if(this.play == song.play) return this.idx - song.idx;
        else return song.play - this.play;
    }
}