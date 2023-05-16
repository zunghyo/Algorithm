package lecture.chapter09_greedyalgorithm.Quiz1_씨름선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    int height;
    int weight;

    public Body(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height;
    }
}

public class Main {

    public int solution(ArrayList<Body> arr, int n){
        int min = Integer.MIN_VALUE;
        int answer = 0;

        Collections.sort(arr);
        for(Body body: arr){
            if(body.weight > min) {
                answer++;
                min = body.weight;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Body(in.nextInt(), in.nextInt()));
        }
        System.out.println(T.solution(list, n));
    }

}
