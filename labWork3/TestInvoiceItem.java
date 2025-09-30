package labWork3;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("A101", "Pen", 10, 2.5);
        System.out.println(item);
        System.out.println("Total = " + item.getTotal());
        item.setQuantity(20);
        item.setUnitPrice(3.0);
        System.out.println("After change: " + item + ", total = " + item.getTotal());
    }
}
