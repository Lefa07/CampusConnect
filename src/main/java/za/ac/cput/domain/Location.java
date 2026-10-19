package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Location {
    private double latitude;
    private double longitude;
    private String address;
    private LocalDateTime timestamp;

    protected Location() {}

    private Location(Builder builder) {
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.address = builder.address;
        this.timestamp = builder.timestamp;
    }

    // Getters
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getAddress() { return address; }
    public LocalDateTime getTimestamp() { return timestamp; }



    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private double latitude;
        private double longitude;
        private String address;
        private LocalDateTime timestamp = LocalDateTime.now();

        public Builder setLatitude(double latitude) { this.latitude = latitude; return this; }
        public Builder setLongitude(double longitude) { this.longitude = longitude; return this; }
        public Builder setAddress(String address) { this.address = address; return this; }
        public Builder setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; return this; }

        public Builder copy(Location location){
            this.latitude = location.latitude;
            this.longitude = location.longitude;
            this.address = location.address;
            this.timestamp = location.timestamp;
            return this;
        }
        public Location build() { return new Location(this); }
    }
}
