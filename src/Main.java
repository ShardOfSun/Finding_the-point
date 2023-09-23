import java.util.Scanner;

public class Main {
    public static final Line L1 = new Line(1.5, 3);
    public static final Line L2 = new Line(4, 1);
    public static final Parabola P = new Parabola(4, 0, 4);
    public static final HorizontalParabola HP1 = new HorizontalParabola(-3, 2, -1);
    public static final HorizontalParabola HP2 = new HorizontalParabola(0, -4, -2);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the program Finding the position of point" +
                "/nEnter Point's coordinate:/n");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

    }
}