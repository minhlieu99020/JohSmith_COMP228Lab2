// Main.java
public class Main {
    public static void main(String[] args) {
        // Create singer1 object using no-argument constructor
        Singers singer1 = new Singers();
        
        // Display the default values
        System.out.println("Default values:");
        singer1.displaySingerInfo();

        // Set values using setters
        singer1.setId(101);
        singer1.setName("Adele");
        singer1.setAddress("London, UK");
        singer1.setDateOfBirth("May 5, 1988");
        singer1.setNumberOfAlbumsPublished(4);

        // Display the updated values
        System.out.println("\nUpdated values:");
        singer1.displaySingerInfo();
    }
}
