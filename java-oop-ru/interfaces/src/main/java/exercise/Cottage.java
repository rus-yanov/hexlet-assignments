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
        String result = this.getFloorCount() + " этажный коттедж площадью " + this.getArea() + " метров";
        return result;
    }

}
// END
