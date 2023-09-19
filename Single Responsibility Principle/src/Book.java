// Book Model
public class Book {
    // instances variables
    String name;
    String authorName;
    int year;
    int price;

    // public constructor
    public Book(String name, String authorName, int year, int price) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }
}

// This class avoid Single Responsibility ( Bad Example )
//class Invoice{
//     Book book;
//     int quantity;
//     double discount;
//     double taxRate;
//     double total;
//
//    public Invoice(Book book, int quantity, double discount, double taxRate, double total) {
//        this.book = book;
//        this.quantity = quantity;
//        this.discount = discount;
//        this.taxRate = taxRate;
//        this.total = total;
//    }
//
//    public double calculateTotal(){
//        double price=((book.price-book.price*discount)*this.quantity);
//        double priceWithTaxes=price*(1+taxRate);
//        return priceWithTaxes;
//    }
//
//    public void printInvoice(){
//        System.out.println(quantity+"x"+book.name+" "+ book.price+"$");
//        System.out.println("Discount Rate: "+discount);
//        System.out.println("taxRate: "+taxRate);
//        System.out.println("total: "+total);
//    }
//
//    public void saveFile(String fileName){
//        // create a file with given name and its invoice
//    }
//}

// what should i do ?

// - Create a class for calculate only total price
class Invoice{
    Book book;
    int quantity;
    double discount;
    double taxRate;
    double total;

    public Invoice(Book book, int quantity, double discount, double taxRate, double total) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;
        this.total = total;
    }

    public double calculateTotal(){
        double price=((book.price-book.price*discount)*this.quantity);
        double priceWithTaxes=price*(1+taxRate);
        return priceWithTaxes;
    }

}

// - Create a class for printing invoice
class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

        public void printInvoice(){
        System.out.println(invoice.quantity+"x"+invoice.book.name+" "+ invoice.book.price+"$");
        System.out.println("Discount Rate: "+invoice.discount);
        System.out.println("taxRate: "+invoice.taxRate);
        System.out.println("total: "+invoice.total);
    }
}

// -  Create a class for Invoice Database
class InvoiceDb{
    private Invoice invoice;

    public InvoiceDb(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveFile(String fileName){
        // create a file with given name and its invoice
    }
}

