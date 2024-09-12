package exercise1;

public class Singers {
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int numberOfAlbumsPublished;

    public Singers() {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numberOfAlbumsPublished = 0;
    }

    public Singers(int id) {
        this();
        this.id = id;
    }

    public Singers(int id, String name) {
        this(id);
        this.name = name;
    }

    public Singers(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    public Singers(int id, String name, String address, String dateOfBirth) {
        this(id, name, address);
        this.dateOfBirth = dateOfBirth;
    }

    public Singers(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this(id, name, address, dateOfBirth);
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

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

    public void setAllValues(int id, String name, String address, String dateOfBirth, int numberOfAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

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

    public void displaySingerInfo() {
        System.out.println("Singer ID: " + id);
        System.out.println("Singer Name: " + name);
        System.out.println("Singer Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + numberOfAlbumsPublished);
    }
}
