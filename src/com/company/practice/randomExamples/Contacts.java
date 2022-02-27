package com.company.practice.randomExamples;

public class Contacts {

    int phoneNumber; //zapisujac jako int trzeba zaznaczyć żeby user wprowadzał telefon bez spacji
    String nameOfContact;
    // int id contactNumber mozna ew dodac

    public Contacts(int phoneNumber, String nameOfContact) {
        this.setPhoneNumber(phoneNumber);
        this.setNameOfContact(nameOfContact);
    }

    @Override
    public String toString() {
        return "Name of contact: " + nameOfContact +
                "  Phone Number: " + phoneNumber ;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

    public void setNameOfContact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }
}
