package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Delivery {
    private Long deliveryId;
    private Long orderId;
    private DeliveryMethod method;
    private CollectionPoint collectionPoint;
    private Address deliveryAddress;
    private LocalDateTime scheduledDate;
    private LocalDateTime deliveredDate;
    private String trackingNumber;
    private double deliveryFee;

    protected Delivery() {}

    private Delivery(Builder builder) {
        this.deliveryId = builder.deliveryId;
        this.orderId = builder.orderId;
        this.method = builder.method;
        this.collectionPoint = builder.collectionPoint;
        this.deliveryAddress = builder.deliveryAddress;
        this.scheduledDate = builder.scheduledDate;
        this.deliveredDate = builder.deliveredDate;
        this.trackingNumber = builder.trackingNumber;
        this.deliveryFee = builder.deliveryFee;
    }

    // Getters
    public Long getDeliveryId() { return deliveryId; }
    public Long getOrderId() { return orderId; }
    public DeliveryMethod getMethod() { return method; }
    public CollectionPoint getCollectionPoint() { return collectionPoint; }
    public Address getDeliveryAddress() { return deliveryAddress; }
    public LocalDateTime getScheduledDate() { return scheduledDate; }
    public LocalDateTime getDeliveredDate() { return deliveredDate; }
    public String getTrackingNumber() { return trackingNumber; }
    public double getDeliveryFee() { return deliveryFee; }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", method=" + method +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", deliveryFee=" + deliveryFee +
                '}';
    }

    public static class Builder {
        private Long deliveryId;
        private Long orderId;
        private DeliveryMethod method;
        private CollectionPoint collectionPoint;
        private Address deliveryAddress;
        private LocalDateTime scheduledDate;
        private LocalDateTime deliveredDate;
        private String trackingNumber;
        private double deliveryFee;

        public Builder setDeliveryId(Long deliveryId) { this.deliveryId = deliveryId; return this; }
        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setMethod(DeliveryMethod method) { this.method = method; return this; }
        public Builder setCollectionPoint(CollectionPoint collectionPoint) { this.collectionPoint = collectionPoint; return this; }
        public Builder setDeliveryAddress(Address deliveryAddress) { this.deliveryAddress = deliveryAddress; return this; }
        public Builder setScheduledDate(LocalDateTime scheduledDate) { this.scheduledDate = scheduledDate; return this; }
        public Builder setDeliveredDate(LocalDateTime deliveredDate) { this.deliveredDate = deliveredDate; return this; }
        public Builder setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; return this; }
        public Builder setDeliveryFee(double deliveryFee) { this.deliveryFee = deliveryFee; return this; }

        public Builder copy(Delivery delivery){
            this.deliveryId = delivery.deliveryId;
            this.orderId = delivery.orderId;
            this.method = delivery.method;
            this.collectionPoint = delivery.collectionPoint;
            this.deliveryAddress = delivery.deliveryAddress;
            this.scheduledDate = delivery.scheduledDate;
            this.deliveredDate = delivery.deliveredDate;
            this.trackingNumber = delivery.trackingNumber;
            this.deliveryFee = delivery.deliveryFee;
            return this;
        }
        public Delivery build() { return new Delivery(this); }
    }
}
