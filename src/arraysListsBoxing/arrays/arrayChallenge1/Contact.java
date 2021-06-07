public class Contact {
    private String name;
    private String telephoneNum;

    public Contact(String name, String telephoneNum) {
        this.name = name;
        this.telephoneNum = telephoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }
}
