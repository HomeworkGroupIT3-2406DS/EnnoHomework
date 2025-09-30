package labWork3;

public class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem() {
        this.id = "";
        this.description = "";
        this.quantity = 0;
        this.unitPrice = 0.0;
    }

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Всего за этот элемент
    public double getTotal() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + description
                + ", qty=" + quantity + ", unitPrice=" + unitPrice + "]";
    }
}
