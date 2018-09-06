package fr.ubordeaux.ao;

import java.util.Objects;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof Mail)) return false;
        Mail otherMail = (Mail) other;
        return  this.mail.compareTo(otherMail.getMail())==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail);
    }

    @Override
    public String toString() {
        return "mails: "+mail;
    }

}