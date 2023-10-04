class Review {
    public static void main(String[] args) {
        Terminal t1 = new Terminal();
        System.out.println(t1.ipAddress + " " + t1.serialNumber);
        Terminal t2 = new Terminal("2.2.2.2", "0987654321");
        System.out.println(t2.ipAddress + " " + t2.serialNumber);
        Terminal t3 = new Terminal("2.2.2.2", "0987654321");
        System.out.println(t3.ipAddress + " " + t3.serialNumber);
        System.out.println("Is t2 and t3 equals: " + t2.equals(t3));
        System.out.println("t2 hashcode: " + t2.hashCode());
        System.out.println("t3 hashcode: " + t3.hashCode());

        Computer c1 = new Computer();
        c1.setIpAddress("5.5.5.5");
        c1.setSerialNumber("A910J7T42P");
        System.out.println(c1.getIpAddress() + " " + c1.getSerialNumber());
    }
}

class Terminal {
    String ipAddress;
    String serialNumber;

    Terminal() {
        this.ipAddress = ipAddress;
        this.serialNumber = serialNumber;
    }

    Terminal(String ipAddress, String serialNumber) {
        this.ipAddress = ipAddress;
        this.serialNumber = serialNumber;
    }
}

class Computer {
    final private static String IPV4_REGEX_PATTERN = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
    final private static String SERIAL_NUMBER_REGEX_PATTERN = "^[A-Za-z0-9]{10}$";

    private String ipAddress;
    private String serialNumber;

    String getIpAddress() {
        return this.ipAddress;
    }

    String getSerialNumber() {
        return this.serialNumber;
    }

    void setIpAddress(String userInput) {
        if (userInput.matches(IPV4_REGEX_PATTERN)) {
            ipAddress = userInput;
        }
    }

    void setSerialNumber(String userInput) {
        if (userInput.matches(SERIAL_NUMBER_REGEX_PATTERN)) {
            serialNumber = userInput;
        }
    }
}