import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddyInfos;
    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    void addBuddyInfo(BuddyInfo buddyInfo) {
        if(buddyInfo != null) {
            buddyInfos.add(buddyInfo);
        }
    }

    void removeBuddyInfo(int index) {
        if(index > 0 && index < buddyInfos.size()){
            buddyInfos.remove(index);
        }

    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton",613);
        AddressBook addressBook = new AddressBook();
        System.out.println("new functionality");
        System.out.println("Test branch functionlaity");
    }
}
