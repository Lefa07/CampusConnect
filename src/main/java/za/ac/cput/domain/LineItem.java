package za.ac.cput.domain;

public class LineItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double total;

    protected LineItem() {}

    private LineItem(Builder builder) {
        this.description = builder.description;
        this.quantity = builder.quantity;
        this.unitPrice = builder.unitPrice;
        this.total = builder.total;
    }

    // Getters
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotal() { return total; }



    @Override
    public String toString() {
        return "LineItem{" +
                "description='" + description + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }

    public static class Builder {
        private String description;
        private int quantity;
        private double unitPrice;
        private double total;

        public Builder setDescription(String description) { this.description = description; return this; }
        public Builder setQuantity(int quantity) { this.quantity = quantity; return this; }
        public Builder setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; return this; }
        public Builder setTotal(double total) { this.total = total; return this; }

        public Builder copy(LineItem lineItem){
            this.description = lineItem.description;
            this.quantity = lineItem.quantity;
            this.unitPrice = lineItem.unitPrice;
            this.total = lineItem.total;
            return this;
        }
        public LineItem build() { return new LineItem(this); }
    }
}
