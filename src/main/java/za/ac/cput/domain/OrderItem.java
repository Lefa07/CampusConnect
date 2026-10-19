package za.ac.cput.domain;

public class OrderItem {
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private int quantity;
    private double priceAtPurchase;

    protected OrderItem() {}

    private OrderItem(Builder builder) {
        this.orderItemId = builder.orderItemId;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.priceAtPurchase = builder.priceAtPurchase;
    }

    // Getters
    public Long getOrderItemId() { return orderItemId; }
    public Long getOrderId() { return orderId; }
    public Long getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPriceAtPurchase() { return priceAtPurchase; }

    public double calculateSubtotal() {
        return quantity * priceAtPurchase;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", subtotal=" + calculateSubtotal() +
                '}';
    }

    public static class Builder {
        private Long orderItemId;
        private Long orderId;
        private Long productId;
        private int quantity;
        private double priceAtPurchase;

        public Builder setOrderItemId(Long orderItemId) { this.orderItemId = orderItemId; return this; }
        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setProductId(Long productId) { this.productId = productId; return this; }
        public Builder setQuantity(int quantity) { this.quantity = quantity; return this; }
        public Builder setPriceAtPurchase(double priceAtPurchase) { this.priceAtPurchase = priceAtPurchase; return this; }

        public Builder copy(OrderItem orderItem){
            this.orderItemId = orderItem.orderItemId;
            this.orderId = orderItem.orderId;
            this.productId = orderItem.productId;
            this.quantity = orderItem.quantity;
            this.priceAtPurchase = orderItem.priceAtPurchase;
            return this;
        }
        public OrderItem build() { return new OrderItem(this); }
    }
}
