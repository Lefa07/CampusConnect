package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Report {
    private String reportId;
    private String reportType;
    private LocalDateTime generatedDate;
    private String generatedBy;
    private byte[] data;
    private String format;
    private Map<String, Object> parameters;
    private List<ReportFilter> filters;

    protected Report() {}

    private Report(Builder builder) {
        this.reportId = builder.reportId;
        this.reportType = builder.reportType;
        this.generatedDate = builder.generatedDate;
        this.generatedBy = builder.generatedBy;
        this.data = builder.data;
        this.format = builder.format;
        this.parameters = builder.parameters;
        this.filters = builder.filters;
    }

    // Getters
    public String getReportId() { return reportId; }
    public String getReportType() { return reportType; }
    public LocalDateTime getGeneratedDate() { return generatedDate; }
    public String getGeneratedBy() { return generatedBy; }
    public byte[] getData() { return data; }
    public String getFormat() { return format; }
    public Map<String, Object> getParameters() { return parameters; }
    public List<ReportFilter> getFilters() { return filters; }

    @Override
    public String toString() {
        return "Report{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", generatedDate=" + generatedDate +
                '}';
    }

    public static class Builder {
        private String reportId;
        private String reportType;
        private LocalDateTime generatedDate = LocalDateTime.now();
        private String generatedBy;
        private byte[] data;
        private String format;
        private Map<String, Object> parameters;
        private List<ReportFilter> filters;

        public Builder setReportId(String reportId) { this.reportId = reportId; return this; }
        public Builder setReportType(String reportType) { this.reportType = reportType; return this; }
        public Builder setGeneratedDate(LocalDateTime generatedDate) { this.generatedDate = generatedDate; return this; }
        public Builder setGeneratedBy(String generatedBy) { this.generatedBy = generatedBy; return this; }
        public Builder setData(byte[] data) { this.data = data; return this; }
        public Builder setFormat(String format) { this.format = format; return this; }
        public Builder setParameters(Map<String, Object> parameters) { this.parameters = parameters; return this; }
        public Builder setFilters(List<ReportFilter> filters) { this.filters = filters; return this; }

        public Builder copy(Report report){
            this.reportId = report.reportId;
            this.reportType = report.reportType;
            this.generatedDate = report.generatedDate;
            this.generatedBy = report.generatedBy;
            this.data = report.data;
            this.format = report.format;
            this.parameters = report.parameters;
            this.filters = report.filters;
            return this;
        }
        public Report build() { return new Report(this); }
    }
}
