package fr.ubordeaux.ao.domain.model;

import java.util.Objects;

import fr.ubordeaux.ao.domain.exception.BankNoteException;

public class BankNote {
    private int amount;

    public BankNote(int amount) {
        this.setAmount(amount);
    }

    public int getAmount() {
        return this.amount;
    }

    private void setAmount(int amount) {
        if (amount <= 0) throw new BankNoteException("cannot create banknote with negative amount");
        this.amount = amount;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof BankNote) {
            BankNote otherBankNote = (BankNote) other;
			return this.amount == otherBankNote.getAmount();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.amount);
    }

    @Override
    public String toString() {
        return "amout="+this.amount;
    }
}
