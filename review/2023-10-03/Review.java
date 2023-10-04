class Review {
    public static void main(String[] args) {
        Terminal t1 = new Terminal();
        System.out.println(t1.ipAddress + " " + t1.serialNumber);
        Terminal t2 = new Terminal("2.2.2.2", "0987654321");
        System.out.println(t2.ipAddress + " " + t2.serialNumber);

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
        ipAddress = "1.1.1.1";
        serialNumber = "1234567890";
    }

    Terminal(String userIp, String userSerial) {
        ipAddress = userIp;
        serialNumber = userSerial;
    }
}

class Computer {
    final static String IPV4_REGEX_PATTERN = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
    final static String SERIAL_NUMBER_REGEX_PATTERN = "^[A-Za-z0-9]{10}$";

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