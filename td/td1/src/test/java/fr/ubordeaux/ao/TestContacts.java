package fr.ubordeaux.ao;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestContacts {
    private final int MAX = 3000;

    @Test
    public void testContacts() {

        ContactSet contactSet = new ContactSet();

        for (int i = 0 ; i < MAX ; i++) {
            Town talence = new Town("Talence", 33405);
            Address address = new Address(351, "Cours de la libération", talence);
            Contact newContact = new Contact("John", "Do", address);
            contactSet.addContact(newContact);
        }
        assertEquals(MAX, contactSet.size());

    }

}