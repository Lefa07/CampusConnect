package za.ac.cput.domain;

public enum VerificationStatus {
    PENDING,
    VERIFIED,
    REJECTED_STUDENT_MISMATCH,
    REJECTED_INVALID_IMAGE,
    REJECTED_CARD_NOT_READABLE,
    APPROVED_COMPLETED
}
