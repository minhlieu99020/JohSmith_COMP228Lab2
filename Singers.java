
// Singers.java
public class Singers {
    // Instance variables
    private int id;
    private String name;
    private String address;
    private String dateOfBirth; // Storing Date of Birth as String for simplicity
    private int numberOfAlbumsPublished;

    // No-argument constructor
    public Singers() {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numberOfAlbumsPublished = 0;
    }

    // 1-argument constructor
    public Singers(int id) {
        this();
        this.id = id;
    }

    // 2-arguments constructor
    public Singers(int id, String name) {
        this(id);
        this.name = name;
    }

    // 3-arguments constructor
    public Singers(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    // 4-arguments constructor
    public Singers(int id, String name, String address, String dateOfBirth) {
        this(id, name, address);
        this.dateOfBirth = dateOfBirth;
    }

    // 5-arguments constructor
    public Singers(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this(id, name, address, dateOfBirth);
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished) {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Set all values at once
    public void setAllValues(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfAlbumsPublished() {
        return numberOfAlbumsPublished;
    }

    // Method to display the singer's details
    public void displaySingerInfo() {
        System.out.println("Singer ID: " + id);
        System.out.println("Singer Name: " + name);
        System.out.println("Singer Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + numberOfAlbumsPublished);
    }
}

