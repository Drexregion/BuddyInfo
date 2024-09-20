

public class BuddyInfo {

    private final String name;
    private final String address;
    private final int phone;

    //    default constructor
    public BuddyInfo() {
        this.name = "default";
        this.address = " ";
        this.phone = 0;
    }

    //    main constructor
    public BuddyInfo(String name, String address, int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Divine","Carleton",0);
        System.out.println("Buddy info " + buddyInfo.getName());
    }
}

