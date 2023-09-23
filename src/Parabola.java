//Парабола (x-a)^2-by+c=0 => (x-a)^2-by+c=0 => (x-x0)^2-ay+y0 => y=((x-x0)^2-y0)/a
public class Parabola {
    double x0;
    double y0;
    double a;

    public Parabola(double x0, double y0, double a){
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointAboveParabola(double x, double y){
        return y > Math.pow(a, -1)* (Math.pow(x-x0, 2)-y0);
    }
}
