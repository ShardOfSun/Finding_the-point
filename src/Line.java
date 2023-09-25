//Линия(по усл-ю - всегда наклонная)
public class Line {
    double x0;
    double a;

    public Line(double x0, double a) {
        this.x0 = x0;
        this.a = a;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y >= a * (x - x0);
    }
}
