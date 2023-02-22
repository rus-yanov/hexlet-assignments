package exercise;

// BEGIN
class Circle {
    private Point point;
    private int rad;

    public Circle(Point point, int rad) {
        this.point = point;
        this.rad = rad;
    }

    public int getRadius() {
        return rad;
    }

    public double getSquare() throws NegativeRadiusException{

        if (rad < 0) {
            throw new NegativeRadiusException("Radius less than zero")
        }
        return Math.PI * Math.pow(rad, 2);
    }
}
// END
