package com.sh;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("You have " + myContacts.size() + " contacts in your contacts list.");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + " " + myContacts.get(i).getName()+ " - " + myContacts.get(i).getNumber());
        }
    }

    public boolean addNew(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("The contact is in your contacts list.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName()+ " was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName()+ " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println("Contact was removed successfully.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact searchContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public String searchContact(Contact contact) {
        if (findContact(contact)>= 0) {
            return contact.getName();
        }
        return null;
    }
}
