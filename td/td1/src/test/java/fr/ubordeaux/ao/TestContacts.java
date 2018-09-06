package fr.ubordeaux.ao;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestContacts {
    private final int MAX = 3000;

    @Test
    public void testContacts() {

        Contacts contacts = new Contacts();

        for (int i = 0 ; i < MAX ; i++) {
            Town talence = new Town("Talence", 33405);
            Address address = new Address(351, "Cours de la libération", talence);
            Contact newContact = new Contact("John", "Do", address);
            contacts.addContact(newContact);
        }
        assertEquals(MAX, contacts.size());

    }

}