package fr.ubordeaux.ao;

public class Main {
    private static  final int MAX = 3000;
    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();

        for (int i = 0 ; i < MAX ; i++) {
            Town talence = new Town("Talence", 33405);
            Address address = new Address(351, "Cours de la libération", talence);
            Contact newContact = new Contact("John", "Do", address);
            contactSet.addContact(newContact);
        }
        System.out.println(MAX+" contacts created !");

        try {
            Thread.sleep(200000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
}