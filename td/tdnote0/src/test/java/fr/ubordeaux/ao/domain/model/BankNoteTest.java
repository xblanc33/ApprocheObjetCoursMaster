package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.*;

import fr.ubordeaux.ao.domain.exception.BankNoteException;

import org.junit.Test;


public class BankNoteTest {

    @Test
    public void shouldThrowException() {
        try {
            BankNote q = new BankNote(0);
            fail("BankNote created although it should not");
        } catch (BankNoteException ex) {
        }
    }

}