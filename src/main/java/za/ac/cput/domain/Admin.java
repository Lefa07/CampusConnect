package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Admin extends User {
    private String employeeId;
    private String department;
    private String accessLevel;
    private LocalDateTime hireDate;
    private List<String> permissions;

    protected Admin() {}

    private Admin(Builder builder) {
        super(builder.userId, builder.firstName, builder.lastName, builder.email, builder.password, builder.profilePicture, builder.isActive, builder.createdAt, builder.lastLogin);
        this.employeeId = builder.employeeId;
        this.department = builder.department;
        this.accessLevel = builder.accessLevel;
        this.hireDate = builder.hireDate;
        this.permissions = builder.permissions;
    }

    // Getters
    public String getEmployeeId() { return employeeId; }
    public String getDepartment() { return department; }
    public String getAccessLevel() { return accessLevel; }
    public LocalDateTime getHireDate() { return hireDate; }
    public List<String> getPermissions() { return permissions; }

    @Override
    public String toString() {
        return "Admin{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", accessLevel='" + accessLevel + '\'' +
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
        private String employeeId;
        private String department;
        private String accessLevel;
        private LocalDateTime hireDate;
        private List<String> permissions;

        public Builder setUserId(Long userId) {this.userId = userId; return this;}
        public Builder setFirstName(String firstName){this.firstName = firstName; return this;}
        public Builder setLastName(String lastName){this.lastName = lastName; return this;}
        public Builder setEmail(String email){this.email = email; return this;}
        public Builder setPassword(String password){this.password = password; return this;}
        public Builder setProfilePicture(String profilePicture) {this.profilePicture = profilePicture; return this;}
        public Builder setIsActive(boolean isActive){this.isActive = isActive; return this;}
        public Builder setCreatedAt(LocalDateTime createdAt ){this.createdAt = createdAt; return this;}
        public Builder setLastLogin(LocalDateTime lastLogin){this.lastLogin = lastLogin; return this;}
        public Builder setEmployeeId(String employeeId) { this.employeeId = employeeId; return this; }
        public Builder setDepartment(String department) { this.department = department; return this; }
        public Builder setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; return this; }
        public Builder setHireDate(LocalDateTime hireDate) { this.hireDate = hireDate; return this; }
        public Builder setPermissions(List<String> permissions) { this.permissions = permissions; return this; }


        public Builder copy(Admin admin) {
            this.userId = admin.userId;
            this.firstName = admin.firstName;
            this.lastName = admin.lastName;
            this.email = admin.email;
            this.password = admin.password;
            this.profilePicture = admin.profilePicture;
            this.isActive = admin.isActive;
            this.createdAt = admin.createdAt;
            this.lastLogin = admin.lastLogin;
            this.employeeId = admin.employeeId;
            this.department = admin.department;
            this.accessLevel = admin.accessLevel;
            this.hireDate = admin.hireDate;
            this.permissions = admin.permissions;
            return this; }

        public Admin build() { return new Admin(this); }
    }
}
