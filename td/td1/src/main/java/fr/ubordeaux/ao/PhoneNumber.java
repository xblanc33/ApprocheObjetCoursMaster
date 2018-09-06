package fr.ubordeaux.ao;

import java.util.Objects;

public class PhoneNumber {
    private int number;

    public PhoneNumber(int number) {
        this.number = number;
    }

    public int getPhoneNumber() {
        return number;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof PhoneNumber)) return false;
        PhoneNumber otherPhoneNumber = (PhoneNumber) other;
        return  number == otherPhoneNumber.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return ""+number;
    }
}