package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        a = Math.pow(a, 2);
        return a;
    }
public static double b (int y1, int y2) {
    double b = y2 - y1;
    b = Math.pow(b,2);
    return b;
}
public static double result (double a, double b) {
    double result = a + b;
    return result;
}
public static double sqrt (double result){
        return result;
}

        public static void main(String[] args) {
            double result = Point.distance(1, 1, 1, 1);
            System.out.println("result (1, 1) to (1, 1) " + result);
        }
    }
