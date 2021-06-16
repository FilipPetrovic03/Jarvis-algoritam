package com.company;

public class Main {
    static class Point {
        int x;
        int y;
    }

    public class Jarvis {

        public void ispisi(Point[] points, int[] next) {
            System.out.println("\ntacke : ");

            for (int i = 0; i < next.length; i++)
                if (next[i] != -1) {
                    System.out.println("( " + points[i].x + ", " + points[i].y + " )");
                }
            }

    }


    public static void main(String[] args) {

    }
}
