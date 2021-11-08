package org.blz.addressbook;



public class CSVUser {

    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phonenumber;
    private String email;

    @Override
    public String toString() {
        return "CSVUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                '}';
    }
}
