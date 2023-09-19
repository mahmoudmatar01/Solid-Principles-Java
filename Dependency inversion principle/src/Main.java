
public class Main {
    public static void main(String[] args) {
//
//        Dependency inversion principle :- High level modules should not depend on low level modules.Both should depend on abstraction.
//                                          Abstraction should not depend on details .
//                                          Details should depend on abstraction.
    }
}
class Product{}

 class DeliveryDriver{
    public void deliveryProduct(Product product){
        // implementation
    }
 }

 // this class violate Dependency Inversion Principle
 class DeliveryCompany{
    public void sendProduct(Product product){
        // this line avoid Dependency Inversion Principle
        DeliveryDriver driver=new DeliveryDriver();
        driver.deliveryProduct(product);
    }
 }

// what should I do ?

// create an abstraction class between two modules
interface DeliveryServices{
    void deliverProduct(Product product);
}

// make DeliveryDriver implement this interface and override method
class DeliveryDriver1 implements DeliveryServices{
    @Override
    public void deliverProduct(Product product) {
        // implementation
    }
}

// make DeliveryDriver implement this interface and override method
class DeliveryCompany1 {

    private DeliveryServices deliveryServices;

    public DeliveryCompany1(DeliveryServices deliveryServices) {
        this.deliveryServices = deliveryServices;
    }
    public void sendProduct(Product product){
        deliveryServices.deliverProduct(product);
    }
}