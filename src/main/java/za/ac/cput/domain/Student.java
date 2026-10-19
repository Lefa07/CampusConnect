package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Student extends User {
    private String studentNumber;
    private String universityEmail;
    private boolean isVerified;
    private double sellerRating;
    private double buyerRating;
    private int totalSales;
    private int totalPurchases;
    private AccommodationType accommodationType;
    private String registeredAddress;
    private boolean isDeliveryEligible;
    private List<Address> addresses;
    private List<Product> products;
    private Cart cart;
    private Wishlist wishlist;
    private List<Order> orders;
    private List<Review> reviewsGiven;
    private List<Review> reviewsReceived;
    private List<ChatRoom> chatRooms;

    protected Student() {}

    private Student(Builder builder) {
        super(builder.userId, builder.firstName, builder.lastName, builder.email, builder.password, builder.profilePicture, builder.isActive, builder.createdAt, builder.lastLogin);
        this.studentNumber = builder.studentNumber;
        this.universityEmail = builder.universityEmail;
        this.isVerified = builder.isVerified;
        this.sellerRating = builder.sellerRating;
        this.buyerRating = builder.buyerRating;
        this.totalSales = builder.totalSales;
        this.totalPurchases = builder.totalPurchases;
        this.accommodationType = builder.accommodationType;
        this.registeredAddress = builder.registeredAddress;
        this.isDeliveryEligible = builder.isDeliveryEligible;
        this.addresses = builder.addresses;
        this.products = builder.products;
        this.cart = builder.cart;
        this.wishlist = builder.wishlist;
        this.orders = builder.orders;
        this.reviewsGiven = builder.reviewsGiven;
        this.reviewsReceived = builder.reviewsReceived;
        this.chatRooms = builder.chatRooms;
    }

    // Getters
    public String getStudentNumber() { return studentNumber; }
    public String getUniversityEmail() { return universityEmail; }
    public boolean isVerified() { return isVerified; }
    public double getSellerRating() { return sellerRating; }
    public double getBuyerRating() { return buyerRating; }
    public int getTotalSales() { return totalSales; }
    public int getTotalPurchases() { return totalPurchases; }
    public AccommodationType getAccommodationType() { return accommodationType; }
    public String getRegisteredAddress() { return registeredAddress; }
    public boolean isDeliveryEligible() { return isDeliveryEligible; }
    public List<Address> getAddresses() { return addresses; }
    public List<Product> getProducts() { return products; }
    public Cart getCart() { return cart; }
    public Wishlist getWishlist() { return wishlist; }
    public List<Order> getOrders() { return orders; }
    public List<Review> getReviewsGiven() { return reviewsGiven; }
    public List<Review> getReviewsReceived() { return reviewsReceived; }
    public List<ChatRoom> getChatRooms() { return chatRooms; }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", universityEmail='" + universityEmail + '\'' +
                ", isVerified=" + isVerified +
                ", sellerRating=" + sellerRating +
                ", buyerRating=" + buyerRating +
                '}';
    }

    public static class Builder {
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String profilePicture;
        private boolean isActive;
        private LocalDateTime createdAt;
        private LocalDateTime lastLogin;
        private String studentNumber;
        private String universityEmail;
        private boolean isVerified;
        private double sellerRating;
        private double buyerRating;
        private int totalSales;
        private int totalPurchases;
        private AccommodationType accommodationType;
        private String registeredAddress;
        private boolean isDeliveryEligible;
        private List<Address> addresses;
        private List<Product> products;
        private Cart cart;
        private Wishlist wishlist;
        private List<Order> orders;
        private List<Review> reviewsGiven;
        private List<Review> reviewsReceived;
        private List<ChatRoom> chatRooms;

        public Builder setUserId(Long userId) {this.userId = userId; return this;}
        public Builder setFirstName(String firstName){this.firstName = firstName; return this;}
        public Builder setLastName(String lastName){this.lastName = lastName; return this;}
        public Builder setEmail(String email){this.email = email; return this;}
        public Builder setPassword(String password){this.password = password; return this;}
        public Builder setProfilePicture(String profilePicture) {this.profilePicture = profilePicture; return this;}
        public Builder setIsActive(boolean isActive){this.isActive = isActive; return this;}
        public Builder setCreatedAt(LocalDateTime createdAt ){this.createdAt = createdAt; return this;}
        public Builder setLastLogin(LocalDateTime lastLogin){this.lastLogin = lastLogin; return this;}
        public Builder setStudentNumber(String studentNumber) { this.studentNumber = studentNumber; return this; }
        public Builder setUniversityEmail(String universityEmail) { this.universityEmail = universityEmail; return this; }
        public Builder setIsVerified(boolean isVerified) { this.isVerified = isVerified; return this; }
        public Builder setSellerRating(double sellerRating) { this.sellerRating = sellerRating; return this; }
        public Builder setBuyerRating(double buyerRating) { this.buyerRating = buyerRating; return this; }
        public Builder setTotalSales(int totalSales) { this.totalSales = totalSales; return this; }
        public Builder setTotalPurchases(int totalPurchases) { this.totalPurchases = totalPurchases; return this; }
        public Builder setAccommodationType(AccommodationType accommodationType) { this.accommodationType = accommodationType; return this; }
        public Builder setRegisteredAddress(String registeredAddress) { this.registeredAddress = registeredAddress; return this; }
        public Builder setIsDeliveryEligible(boolean isDeliveryEligible) { this.isDeliveryEligible = isDeliveryEligible; return this; }
        public Builder setAddresses(List<Address> addresses) { this.addresses = addresses; return this; }
        public Builder setProducts(List<Product> products) { this.products = products; return this; }
        public Builder setCart(Cart cart) { this.cart = cart; return this; }
        public Builder setWishlist(Wishlist wishlist) { this.wishlist = wishlist; return this; }
        public Builder setOrders(List<Order> orders) { this.orders = orders; return this; }
        public Builder setReviewsGiven(List<Review> reviewsGiven) { this.reviewsGiven = reviewsGiven; return this; }
        public Builder setReviewsReceived(List<Review> reviewsReceived) { this.reviewsReceived = reviewsReceived; return this; }
        public Builder setChatRooms(List<ChatRoom> chatRooms) { this.chatRooms = chatRooms; return this; }


        public Builder copy(Student student) {
            this.userId = student.userId;
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.email = student.email;
            this.password = student.password;
            this.profilePicture = student.profilePicture;
            this.isActive = student.isActive;
            this.createdAt = student.createdAt;
            this.lastLogin = student.lastLogin;
            this.studentNumber = student.studentNumber;
            this.universityEmail = student.universityEmail;
            this.isVerified = student.isVerified;
            this.sellerRating = student.sellerRating;
            this.buyerRating = student.buyerRating;
            this.totalSales = student.totalSales;
            this.totalPurchases = student.totalPurchases;
            this.accommodationType = student.accommodationType;
            this.registeredAddress = student.registeredAddress;
            this.isDeliveryEligible = student.isDeliveryEligible;
            this.addresses = student.addresses;
            this.products = student.products;
            this.cart = student.cart;
            this.wishlist = student.wishlist;
            this.orders = student.orders;
            this.reviewsGiven = student.reviewsGiven;
            this.reviewsReceived = student.reviewsReceived;
            this.chatRooms = student.chatRooms;
            return this; }

        public Student build() { return new Student(this); }
    }
}
