package exercise1;

public class Main {
    public static void main(String[] args) {
        Singers singer1 = new Singers();

        System.out.println("Default values:");
        singer1.displaySingerInfo();

        singer1.setId(101);
        singer1.setName("Adele");
        singer1.setAddress("London, UK");
        singer1.setDateOfBirth("May 5, 1988");
        singer1.setNumberOfAlbumsPublished(4);

        System.out.println("\nUpdated values:");
        singer1.displaySingerInfo();
    }
}
