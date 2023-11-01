import java.util.Objects;

class Computer {
    private static final String IPV4_REGEX_PATTERN = "^(?:\\d{1,3}\\.){3}\\d{1,3}$";
    private static final String SERIAL_NUMBER_REGEX_PATTERN = "^[A-Za-z0-9]{10}$";

    private String ipAddress;
    private String serialNumber;

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) return true;

        if (otherObject == null) return false;

        if (!(otherObject instanceof Computer c)) return false;

        return Objects.equals(ipAddress, c.ipAddress) && Objects.equals(serialNumber, c.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, serialNumber);
    }

    String getIpAddress() {
        return this.ipAddress;
    }

    String getSerialNumber() {
        return this.serialNumber;
    }

    void setIpAddress(String ipAddress) {
        if (ipAddress.matches(IPV4_REGEX_PATTERN)) {
            this.ipAddress = ipAddress;
        }
    }

    void setSerialNumber(String serialNumber) {
        if (serialNumber.matches(SERIAL_NUMBER_REGEX_PATTERN)) {
            this.serialNumber = serialNumber;
        }
    }
}