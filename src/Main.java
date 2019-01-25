import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj współrzędną X: ");
        double x = scanner.nextDouble();

        System.out.print("Podaj współrzędną Y: ");
        double y = scanner.nextDouble();

        Point point = new Point(x,y);
        QuadrantTest quadrantTest = new QuadrantTest();

        System.out.println("Punkt [" + point.getX() + ", " + point.getY() + "] leży w " + quadrantTest.giveQuadrant(point) + ". ćwiartce układu współrzędnych.");

    }
}