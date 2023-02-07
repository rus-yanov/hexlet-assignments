package exercise;

// BEGIN
public interface Home {

    double getArea();

    default int compareTo(Home another){
        if (another.getArea() > this.area) return -1;
        if (another.getArea() == this.area) return -0;
        else return 1;
    }
}
// END
