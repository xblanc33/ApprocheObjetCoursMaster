package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact {
    private static int nextId=1;
    private int id;
    private String firstName;
    private String secondName;
    private Address address;
    private Set<Mail> mails;
    private Set<PhoneNumber> phones;


    public Contact(String firstName, String secondName, Address address) {
        this.id = Contact.nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        mails = new HashSet<Mail>();
        phones = new HashSet<PhoneNumber>();
    }

    public int id() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void changeAddress(Address newAddress) {
        this.address = newAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public void removeMail(Mail mail) {
        mails.remove(mail);
    }

    public Set<Mail> getMails() {
        Set<Mail> mailz = new HashSet<Mail>();
        mailz.addAll(mails);
        return mailz;
    }

    public void addPhoneNumber(PhoneNumber phone) {
        phones.add(phone);
    }

    public void removePhoneNumber(PhoneNumber phone) {
        phones.remove(phone);
    }

    public Set<PhoneNumber> getPhoneNumbers() {
        Set<PhoneNumber> phonez = new HashSet<PhoneNumber>();
        phonez.addAll(phones);
        return phonez;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Contact)) return false;
        Contact otherContact = (Contact) other;
        return  this.id == otherContact.id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "contact "+id;
    }
}