package exercise;

// BEGIN
public class Cottage implements Home{
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public String toString() {
        String result = floorCount + " этажный коттедж площадью " + area + " метров";
        return result;
    }

    public int compareTo(Home another) {
        if (another.getArea() > this.area) return -1;
        if (another.getArea() == this.area) return -0;
        else return 1;
    }
}
// END
