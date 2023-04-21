package lecture.sorting_searching.Quiz7_좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        if(this.x == o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        for (Point point: list) {
            System.out.println(point.x +" "+ point.y);
        }
    }
}
