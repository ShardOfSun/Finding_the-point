import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static final Line L1 = new Line(1.5, -2);
    public static final Line L2 = new Line(-4, 1.0 / 4.0);
    public static final Parabola P = new Parabola(4, 0, -0.5);
    public static final HorizontalParabola HP = new HorizontalParabola(0, -4, -0.125);

    /* не влияет на результат
    public static final HorizontalParabola HP1 = new HorizontalParabola(-3, 2, -1); */

    public static Colors getColor(double x, double y) {
        if (L2.isPointAboveLine(x, y) & HP.isPointLeftOfHorizontalParabola(x, y) ||
        !P.isPointAboveParabola(x, y) & L1.isPointAboveLine(x, y)) {
            return Colors.GREEN; }
        if (HP.isPointLeftOfHorizontalParabola(x, y)) {
            return Colors.BLUE; }
        if (!P.isPointAboveParabola(x, y)){
            return Colors.GRAY; }
        if (!L2.isPointAboveLine(x, y) & L1.isPointAboveLine(x, y)){
            return Colors.ORANGE; }
        if (!L2.isPointAboveLine(x, y)){
            return Colors.YELLOW; }

        return Colors.WHITE;
    }

    public static void Example() {
        int x = 0;
        int y = 0;

        System.out.println("GREEN:");
        int[] Gx = new int[]{-10, -10, -5, -5, 4, 5, 7};
        int[] Gy = new int[]{4, 0, 2, 0, -1, -5, -10};
        for (int i = 0; i < Gx.length; i++) {
            x = Gx[i];
            y = Gy[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }

        System.out.println("YELLOW");
        int[] Yx = new int[]{0, -1, -1, 1, -4};
        int[] Yy = new int[]{0, -7, -1, -4, -10};
        for (int i = 0; i < Yx.length; i++) {
            x = Yx[i];
            y = Yy[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }

        System.out.println("BLUE:");
        int[] Bx = new int[]{-1, -10, -10, -3};
        int[] By = new int[]{-4, -10, -2, 0};
        for (int i = 0; i < Bx.length; i++) {
            x = Bx[i];
            y = By[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }

        System.out.println("ORANGE:");
        int[] Ox = new int[]{2, 10, 10, 2};
        int[] Oy = new int[]{0, 3, -10, 1};
        for (int i = 0; i < Oy.length; i++) {
            x = Ox[i];
            y = Oy[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }

        System.out.println("GRAY:");
        int[] Grx = new int[]{2, 0, 6, 3};
        int[] Gry = new int[]{-3, -10, -10, -4};
        for (int i = 0; i < Grx.length; i++) {
            x = Grx[i];
            y = Gry[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }

        System.out.println("WHITE:");
        int[] Wx = new int[]{0, -3, -10, 0};
        int[] Wy = new int[]{2, 1, 6, 10};
        for (int i = 0; i < Wx.length; i++) {
            x = Wx[i];
            y = Wy[i];
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the program Finding the position of point");

        while (true) {
            System.out.println("\n(1) Enter Point's coordinate\n(2) Show examples\n(0) Exit");
            switch (scanner.nextInt()) {
                case 1 -> { }
                case 2 -> {
                    Example();
                    continue;
                }
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("Incorrect input!");
                    continue;
                }
            }

            System.out.println("Enter x and y: ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
            }
        }
}