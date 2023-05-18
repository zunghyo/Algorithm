package lecture.chapter09_greedyalgorithm.Quiz3_결혼식;

import java.util.*;

class Time implements Comparable<Time>{
    int time;
    char state;

    public Time(int time, char state){
        this.time = time;
        this.state = state;
    }


    @Override
    public int compareTo(Time o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class Main {

    public int solution(ArrayList<Time> list, int n){
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(list);
        for(Time time: list){
            if(time.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(in.nextInt(), 's'));
            list.add(new Time(in.nextInt(), 'e'));
        }
        System.out.println(T.solution(list, n));
    }

}
