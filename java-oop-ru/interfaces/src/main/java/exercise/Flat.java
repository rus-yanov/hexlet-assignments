package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public String toString() {
        String result = "Квартира площадью " + area + " на " + floor + " этаже";
        return result;
    }

    public int compareTo(Home another) {
        if (another.getArea() > this.area) return -1;
        if (another.getArea() == this.area) return -0;
        else return 1;
    }
}
// END
