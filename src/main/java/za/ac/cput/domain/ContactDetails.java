package za.ac.cput.domain;

public class ContactDetails {
    private String cellNumber;
    private String email;
    private String homePhone;
    private String emergencyContact;

    protected ContactDetails() {}

    private ContactDetails(Builder builder) {
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
        this.homePhone = builder.homePhone;
        this.emergencyContact = builder.emergencyContact;
    }

    // Getters
    public String getCellNumber() { return cellNumber; }
    public String getEmail() { return email; }
    public String getHomePhone() { return homePhone; }
    public String getEmergencyContact() { return emergencyContact; }



    @Override
    public String toString() {
        return "ContactDetails{" +
                "cellNumber='" + cellNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String cellNumber;
        private String email;
        private String homePhone;
        private String emergencyContact;

        public Builder setCellNumber(String cellNumber) { this.cellNumber = cellNumber; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setHomePhone(String homePhone) { this.homePhone = homePhone; return this; }
        public Builder setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; return this; }

        public Builder copy(ContactDetails contactDetails){
            this.cellNumber = contactDetails.cellNumber;
            this.email = contactDetails.email;
            this.homePhone = contactDetails.homePhone;
            this.emergencyContact = contactDetails.emergencyContact;
            return this;
        }
        public ContactDetails build() { return new ContactDetails(this); }
    }
}
