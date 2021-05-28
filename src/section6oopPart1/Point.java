package section6oopPart1;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("This is the no-arg constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        int objX = this.x;
        int objY = this.y;
        return Math.sqrt((0.0 - objX) * (0.0 - objX) + (0.0 - objY) * (0.0 - objY));
    }

    public double distance(int x, int y) {
        int objX = this.x;
        int objY = this.y;

        return Math.sqrt((x - objX) * (x - objX) + (y - objY) * (y - objY));
    }

    public double distance(Point anotherPoint) {
        int anotherX = anotherPoint.getX();
        int anotherY = anotherPoint.getY();

        int objX = this.x;
        int objY = this.y;

        return Math.sqrt((anotherX - objX) * (anotherX - objX) + (anotherY - objY) * (anotherY - objY));
    }
}
