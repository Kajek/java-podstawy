package com.company.practice.dodatkoweZadania;

import com.company.practice.randomExamples.Contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {

    Scanner scanner = new Scanner(System.in);
    List<Contacts> contactsList = new ArrayList<>();
    String userInput;
    boolean isWorking = true;

    public MobilePhone(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    public void menu(){
        while (isWorking){
            System.out.println("Menu:");
            System.out.printf("""
                    Print list of contacts - %9s
                    Add contact - %18s\s
                    Update existing contact - %9s\s
                    Remove contact - %18s\s
                    Search for contact - %12s\s
                    Quit program - %18s\s
                    """, "print", "add", "update", "delete", "find", "quit");
            System.out.println("Please choose an option: ");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "quit" -> {
                    System.out.println("Shutting down");
                    isWorking = false;
                }
                case "print" -> {
                    System.out.println("List of contacts: ");
                    for (Object contact : contactsList) {
                        System.out.println(contact);
                    }
                }
                case "add" -> {
                    System.out.println("Adding contact: ");
                    System.out.println("Type in name of contact: ");
                    String nameOfContact = scanner.nextLine();
                    System.out.println("Type in contact phone number(NO SPACES, 9 digits): ");
                    int phoneNumber = scanner.nextInt();
                    Contacts contact = new Contacts(phoneNumber, nameOfContact);
                    if (contactsList.isEmpty()) {
                        contactsList.add(contact);
                    } else {
                        for (Contacts c : contactsList) {
                            if (!c.getNameOfContact().equals(nameOfContact)) {
                                contactsList.add(contact);
                            } else {
                                System.out.println("Sorry, contact with that name already exists");
                            }
                            break;
                        }
                    }
                    scanner.nextLine();
                }
                case "update" -> {
                    System.out.println("Type in name of contact to update");
                    Contacts contactToUpdate = findExactContact(scanner.nextLine());
                    if (contactToUpdate != null) {
                        System.out.println("Update contact name");
                        contactToUpdate.setNameOfContact(scanner.nextLine());
                        System.out.println("Update contact number");
                        contactToUpdate.setPhoneNumber(scanner.nextInt());
                    } else {
                        System.out.println("Couldn't find that contact");
                    }
                }
                case "delete" -> {
                    System.out.println("Type in name of contact to delete from contact list");
                    Contacts contactToDelete = findExactContact(scanner.nextLine());
                    if (contactToDelete != null) {
                        System.out.println("Deleted contact: " + contactToDelete);
                        contactsList.remove(contactToDelete);
                    } else {
                        System.out.println("Couldn't find that contact");
                    }
                }
                case "find" -> {
                    System.out.println("Type in name to search for in contact list: ");
                    Contacts contactToFind = findContact(scanner.nextLine());
                        if (contactToFind != null) {
                            System.out.println(contactToFind);
                        } else {
                            System.out.println("Couldn't find that contact");
                        }
                    }
                default -> {
                    System.out.println("Invalid input, please try again");
                }
            }
        }
    }
    public Contacts findExactContact(String nameToFind){
        for(Contacts c : contactsList){
            if(c.getNameOfContact().equals(nameToFind)){
                return c;
            }
        }
        return null;
    }

    public Contacts findContact(String nameToFind){ //szuka po części tekstu
        for(Contacts c : contactsList){
            if(c.getNameOfContact().contains(nameToFind)){
                return c;
            }
        }
        return null;
    }

    public List<Contacts> getContactsList() {
        return contactsList;
    }

//    public void setContactsList(List<Contacts> contactsList) { - niepotrzebny setter bo na poczatku to inicjalizuje
//        this.contactsList = contactsList;
//    }
}
