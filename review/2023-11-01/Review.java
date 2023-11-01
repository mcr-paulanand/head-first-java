class Review {
    public static void main(String[] args) {
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