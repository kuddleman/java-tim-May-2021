import java.util.ArrayList;

public class MobileTelephone {
    private ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }
    public ArrayList<Contact> getContactList(){
        return contactList;
    }
    public void printContactList(){
        System.out.println("You have " + contactList.size() +
                " contacts in your contact list.");

        for(int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }

    private int findItem(Contact contact){
        String searchName = contact.getName();
        for(int i = 0; i < contactList.size(); i++) {
            String contactName = contactList.get(i).getName();
            if(contactName.equalsIgnoreCase(searchName)) {
               return i;
            }
        }
        System.out.println("Contact is not in list.");
        return -1;
    }
}
