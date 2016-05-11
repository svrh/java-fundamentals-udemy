package com.sh;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

	    //menu - quit, print list, add new, update, remove, search
        boolean quit = false;
        int option = 0;
        printOptions();
        while (!quit) {
            System.out.println("Please enter menu option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNew();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Press ");
        System.out.println("0 - To print menu options.");
        System.out.println("1 - To print contacts list.");
        System.out.println("2 - To add new contact.");
        System.out.println("3 - To change item in the list.");
        System.out.println("4 - To remove item from the list.");
        System.out.println("5 - To search for item in the list.");
        System.out.println("6 - To quit.");
    }

    public static void addNew() {
        System.out.println("Please enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter contact number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if (mobilePhone.addNew(newContact)) {
            System.out.println("New contact added: Name: " + name + ". Phone: " + number);
        } else {
            System.out.println(name + " already on the list.");
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting record.");
        }
    }

    public static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.searchContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + ", Phone: " + existingContact.getNumber());
    }
}
