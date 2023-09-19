public class Main {
    public static void main(String[] args) {

//        Interface segregation principle :- Isp splits interfaces that are very large into smaller and more specific ones so that
//                                           clients will only have to know about the methods that are of interest to them .


    }
}
class Car{}

// this interface violate ISP because the FreeParking class doesn't care about calculateFee and doPayment Methods
// this is a fat interface
interface  ParkingLot{
    void parkCar();
    void unParkCar();
    int getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}


class FreeParking implements ParkingLot{
    @Override
    public void parkCar() {

    }

    @Override
    public void unParkCar() {

    }

    @Override
    public int getCapacity() {
        return 0;
    }

    // doesn't care about this method
    @Override
    public double calculateFee(Car car) {
        return 0;
    }
    // doesn't care about this method
    @Override
    public void doPayment(Car car) {

    }
}

//what should i do?

// Create a class that have all common method between Free and Paid Parking classes
// do FreeParking Class Behaviour
interface  Parking{
    void parkCar();
    void unParkCar();
    int getCapacity();
}

// Create a Paid Parking interface implement Parking or Free Parking Interface and add Paid Options MEthod
interface PaidParking extends Parking{
    @Override
    void parkCar();
    @Override
    void unParkCar();
    @Override
    int getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}