package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class Contacts {
    private Set<Contact> contacts;

    public Contacts() {
        contacts = new HashSet<Contact>();
    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public void removeContact(Contact oldContact) {
        contacts.remove(oldContact);
    }

    public int size() {
        return contacts.size();
    }

    public Set<Contact> getContacts(int from, int to) {
        Set<Contact> result = new HashSet<Contact>();
        int i = 0;
        for (Contact contact : contacts) {
            if (i >= from) {
                result.add(contact);
            }
            if (i >= to) {
                return result;
            }
        }
        return result;
    }
}