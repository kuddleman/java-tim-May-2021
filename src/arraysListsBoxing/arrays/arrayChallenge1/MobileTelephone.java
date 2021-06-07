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

    private int findContact(Contact contact){
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

    public boolean onFile(Contact contact) {
        int position = findContact(contact);
        if(position >= 0) {
            return true;
        }
        return false;
    }

    //modify
    public void modifyContact(Contact currentContact, Contact newContact) {
        int position = findContact(currentContact);
        if(position >= 0) {
            modifyGroceryItem(position, newContact);
        }
    }
    private void modifyGroceryItem(int position, Contact newContact) {
        contactList.set(position, newContact);
        System.out.println("Contact number " + (position + 1) +
                " has been modified.");
    }
    public void removeContact(Contact contact) {
        int position = findContact(contact);
        if(position >= 0) {
            removeContact(position);
        }
    }
    private void removeContact(int position) {
        contactList.remove(position);
    }
}
