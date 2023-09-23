//Горизонтальная парабола (y-a)^2=bx+c => a(y-y0)^2=x+x0 => x=a(y-y0)^2-x0
public class HorizontalParabola {
    public double x0;
    public double y0;
    public double a;
    public HorizontalParabola(double x0, double y0, double a){
        this.x0 = x0;
        this.y0 = y0;
        this.a = Math.pow(a,-3);
    }

    public boolean isPointLeftOfHorizontalParabola(double x, double y){
        return x < a*Math.pow(y-y0,2)+x0;
    }
}
