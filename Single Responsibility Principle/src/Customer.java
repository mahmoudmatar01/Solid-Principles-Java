
//Example 1 : This class avoid Single Responsibility (Bad Example)

import java.util.ArrayList;
import java.util.List;

public class Customer {

    // instance variable
    private String customerName;

    // Methods
    private void storeCustomer(String customerName){
        // store customer into a database
    }

    private void generateCustomerReport(String customerName){
        // generate a report
    }
}


// What should i to make it Single Responsibility ?

// - Create our Entity Or Model
class CustomerModel{
    private String name;

    public CustomerModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// - Create a Class for Customer DB to store customers on it
class CustomerDB{
    List<CustomerModel> customerDb=new ArrayList<>();
    private void storeCustomer(String customerName){
        // store customer into a database
        customerDb.add(new CustomerModel(customerName));
    }

}
// - Create a class for print or generate customer report
class CustomerReportGenerator{
    private void generateCustomerReport(String customerName){
        // generate a report
    }
}