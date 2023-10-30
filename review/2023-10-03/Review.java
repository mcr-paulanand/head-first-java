import java.util.Objects;

class Review {
    public static void main(String[] args) {
        System.out.println("TERMINAL\n========");
        Terminal t1 = new Terminal("2.2.2.2", "0987654321");
        System.out.println("t1: " + t1.ipAddress + " " + t1.serialNumber);
        Terminal t2 = new Terminal("2.2.2.2", "0987654321");
        System.out.println("t2: " + t2.ipAddress + " " + t2.serialNumber);
        System.out.println();

        System.out.println("Is t1 and t2 equals: " + t1.equals(t2));
        System.out.println("t1 hashcode: " + t1.hashCode());
        System.out.println("t2 hashcode: " + t2.hashCode());
        System.out.println();

        System.out.println("COMPUTER\n========");
        Computer c1 = new Computer();
        c1.setIpAddress("5.5.5.5");
        c1.setSerialNumber("A910J7T42P");
        System.out.println("c1: " + c1.getIpAddress() + " " + c1.getSerialNumber());
        Computer c2 = new Computer();
        c2.setIpAddress("5.5.5.5");
        c2.setSerialNumber("A910J7T42P");
        System.out.println("c2: " + c2.getIpAddress() + " " + c2.getSerialNumber());
        System.out.println();

        System.out.println("Is c1 and c2 equals: " + c1.equals(c2));
        System.out.println("c1 hashcode: " + c1.hashCode());
        System.out.println("c2 hashcode: " + c2.hashCode());
        System.out.println();

        Computer c3 = c2;
        System.out.println("Is c2 and c3 equals: " + c2.equals(c3));
        System.out.println("c2 hashcode: " + c2.hashCode());
        System.out.println("c3 hashcode: " + c3.hashCode());
        System.out.println();
    }
}

class Terminal {
    String ipAddress;
    String serialNumber;

    Terminal(String ipAddress, String serialNumber) {
        this.ipAddress = ipAddress;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) return true;

        if (otherObject == null) return false;

        if (!(otherObject instanceof Terminal t)) return false;

        return Objects.equals(ipAddress, t.ipAddress) && Objects.equals(serialNumber, t.serialNumber);
    }
}

class Computer {
    final private static String IPV4_REGEX_PATTERN = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
    final private static String SERIAL_NUMBER_REGEX_PATTERN = "^[A-Za-z0-9]{10}$";

    private String ipAddress;
    private String serialNumber;

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == this) return true;

        if (otherObject == null) return false;

        if (!(otherObject instanceof Computer c)) return false;

        return Objects.equals(ipAddress, c.ipAddress) && Objects.equals(serialNumber, c.serialNumber);
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