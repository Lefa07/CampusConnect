package za.ac.cput.domain;

public class ReportFilter {
    private Long filterId;
    private String reportId;
    private String fieldName;
    private String operator;
    private String value;

    protected ReportFilter() {}

    private ReportFilter(Builder builder) {
        this.filterId = builder.filterId;
        this.reportId = builder.reportId;
        this.fieldName = builder.fieldName;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    // Getters
    public Long getFilterId() { return filterId; }
    public String getReportId() { return reportId; }
    public String getFieldName() { return fieldName; }
    public String getOperator() { return operator; }
    public String getValue() { return value; }

    @Override
    public String toString() {
        return "ReportFilter{" +
                "filterId=" + filterId +
                ", fieldName='" + fieldName + '\'' +
                ", operator='" + operator + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public static class Builder {
        private Long filterId;
        private String reportId;
        private String fieldName;
        private String operator;
        private String value;

        public Builder setFilterId(Long filterId) { this.filterId = filterId; return this; }
        public Builder setReportId(String reportId) { this.reportId = reportId; return this; }
        public Builder setFieldName(String fieldName) { this.fieldName = fieldName; return this; }
        public Builder setOperator(String operator) { this.operator = operator; return this; }
        public Builder setValue(String value) { this.value = value; return this; }

        public Builder copy(ReportFilter reportFilter){
            this.filterId = reportFilter.filterId;
            this.reportId = reportFilter.reportId;
            this.fieldName = reportFilter.fieldName;
            this.operator = reportFilter.operator;
            this.value = reportFilter.value;
            return this;
        }
        public ReportFilter build() { return new ReportFilter(this); }
    }
}
