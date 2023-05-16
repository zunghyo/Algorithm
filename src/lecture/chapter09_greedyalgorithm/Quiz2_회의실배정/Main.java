package lecture.chapter09_greedyalgorithm.Quiz2_회의실배정;

import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}

public class Main {

    public int solution(ArrayList<Meeting> list, int n){
        int answer = 0;
        int end = 0;
        Collections.sort(list);
        for (Meeting meeting: list){
            if(meeting.start >= end){
                end = meeting.end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Meeting(in.nextInt(), in.nextInt()));
        }
        System.out.println(T.solution(list, n));
    }

}
