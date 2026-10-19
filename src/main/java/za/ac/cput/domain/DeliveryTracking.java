package za.ac.cput.domain;

import java.time.LocalDateTime;

public class DeliveryTracking {
    private Long trackingId;
    private Long deliveryId;
    private String status;
    private String location;
    private LocalDateTime timestamp;
    private String description;

    protected DeliveryTracking() {}

    private DeliveryTracking(Builder builder) {
        this.trackingId = builder.trackingId;
        this.deliveryId = builder.deliveryId;
        this.status = builder.status;
        this.location = builder.location;
        this.timestamp = builder.timestamp;
        this.description = builder.description;
    }

    // Getters
    public Long getTrackingId() { return trackingId; }
    public Long getDeliveryId() { return deliveryId; }
    public String getStatus() { return status; }
    public String getLocation() { return location; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "DeliveryTracking{" +
                "trackingId=" + trackingId +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class Builder {
        private Long trackingId;
        private Long deliveryId;
        private String status;
        private String location;
        private LocalDateTime timestamp = LocalDateTime.now();
        private String description;

        public Builder setTrackingId(Long trackingId) { this.trackingId = trackingId; return this; }
        public Builder setDeliveryId(Long deliveryId) { this.deliveryId = deliveryId; return this; }
        public Builder setStatus(String status) { this.status = status; return this; }
        public Builder setLocation(String location) { this.location = location; return this; }
        public Builder setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; return this; }
        public Builder setDescription(String description) { this.description = description; return this; }

        public Builder copy(DeliveryTracking deliveryTracking){
            this.trackingId = deliveryTracking.trackingId;
            this.deliveryId = deliveryTracking.deliveryId;
            this.status = deliveryTracking.status;
            this.location = deliveryTracking.location;
            this.timestamp = deliveryTracking.timestamp;
            this.description = deliveryTracking.description;
            return this;
        }
        public DeliveryTracking build() { return new DeliveryTracking(this); }
    }
}
