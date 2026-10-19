package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long orderId;
    private Long buyerId;
    private String orderReference;
    private LocalDateTime orderDate;
    private double totalAmount;
    private OrderStatus status;
    private String specialInstructions;
    private LocalDateTime completedDate;
    private List<OrderItem> orderItems;
    private Payment payment;
    private Delivery delivery;
    private Receipt receipt;

    protected Order() {}

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.buyerId = builder.buyerId;
        this.orderReference = builder.orderReference;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
        this.status = builder.status;
        this.specialInstructions = builder.specialInstructions;
        this.completedDate = builder.completedDate;
        this.orderItems = builder.orderItems;
        this.payment = builder.payment;
        this.delivery = builder.delivery;
        this.receipt = builder.receipt;
    }

    // Getters
    public Long getOrderId() { return orderId; }
    public Long getBuyerId() { return buyerId; }
    public String getOrderReference() { return orderReference; }
    public LocalDateTime getOrderDate() { return orderDate; }
    public double getTotalAmount() { return totalAmount; }
    public OrderStatus getStatus() { return status; }
    public String getSpecialInstructions() { return specialInstructions; }
    public LocalDateTime getCompletedDate() { return completedDate; }
    public List<OrderItem> getOrderItems() { return orderItems; }
    public Payment getPayment() { return payment; }
    public Delivery getDelivery() { return delivery; }
    public Receipt getReceipt() { return receipt; }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderReference='" + orderReference + '\'' +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private Long orderId;
        private Long buyerId;
        private String orderReference;
        private LocalDateTime orderDate = LocalDateTime.now();
        private double totalAmount;
        private OrderStatus status = OrderStatus.PENDING_PAYMENT;
        private String specialInstructions;
        private LocalDateTime completedDate;
        private List<OrderItem> orderItems;
        private Payment payment;
        private Delivery delivery;
        private Receipt receipt;

        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setBuyerId(Long buyerId) { this.buyerId = buyerId; return this; }
        public Builder setOrderReference(String orderReference) { this.orderReference = orderReference; return this; }
        public Builder setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; return this; }
        public Builder setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; return this; }
        public Builder setStatus(OrderStatus status) { this.status = status; return this; }
        public Builder setSpecialInstructions(String specialInstructions) { this.specialInstructions = specialInstructions; return this; }
        public Builder setCompletedDate(LocalDateTime completedDate) { this.completedDate = completedDate; return this; }
        public Builder setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; return this; }
        public Builder setPayment(Payment payment) { this.payment = payment; return this; }
        public Builder setDelivery(Delivery delivery) { this.delivery = delivery; return this; }
        public Builder setReceipt(Receipt receipt) { this.receipt = receipt; return this; }

        public Builder copy(Order order){
            this.orderId = order.orderId;
            this.buyerId = order.buyerId;
            this.orderReference = order.orderReference;
            this.orderDate = order.orderDate;
            this.totalAmount = order.totalAmount;
            this.status = order.status;
            this.specialInstructions = order.specialInstructions;
            this.completedDate = order.completedDate;
            this.orderItems = order.orderItems;
            this.payment = order.payment;
            this.delivery = order.delivery;
            this.receipt = order.receipt;
            return this;
        }
        public Order build() { return new Order(this); }
    }
}
