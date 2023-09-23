//Линия(по усл-ю - всегда наклонная) y-a=b(x+c) => y-y0=a(x-x0) => y=a(x-x0)+y0 => y=-((y0-0)/(x0-0))(x-x0)
public class Line {
    double x0;
    double y0;

    public Line(double x0, double y0){
        this.x0 = x0;
        this.y0 = y0;
    }

    public boolean isPointAboveLine(double x, double y){
        return y > -(y0/x0)*(x-x0);
    }
}
