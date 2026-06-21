public class BuilderPatternTest {
    public static void main(String[] args) {
        System.out.println(" Testing Builder Pattern ");

        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer officePC = new Computer.Builder("Intel Core i3", "8GB")
                .setStorage("256GB SSD")
                .setGraphicsCardEnabled(false)
                .build();

        System.out.println("\nGaming PC Configuration:");
        System.out.println(gamingPC);

        System.out.println("\nOffice PC Configuration:");
        System.out.println(officePC);
    }
}