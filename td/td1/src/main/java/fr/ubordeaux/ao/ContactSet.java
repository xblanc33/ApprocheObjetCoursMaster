package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class ContactSet {
    private Set<Contact> contactSet;

    public ContactSet() {
        contactSet = new HashSet<Contact>();
    }

    public void addContact(Contact newContact) {
        contactSet.add(newContact);
    }

    public void removeContact(Contact oldContact) {
        contactSet.remove(oldContact);
    }

    public int size() {
        return contactSet.size();
    }

    public Set<Contact> getContactSet(int from, int to) {
        Set<Contact> result = new HashSet<Contact>();
        int i = 0;
        for (Contact contact : contactSet) {
            if (i >= from) {
                result.add(contact);
            }
            if (i >= to) {
                return result;
            }
            i++;
        }
        return result;
    }
}