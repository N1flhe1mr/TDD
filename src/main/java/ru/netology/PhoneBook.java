package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> contacts = new TreeMap<>();
    private Map<String, String> contactsByPhoneNumber = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        contactsByPhoneNumber.put(phoneNumber, name);
        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        return contactsByPhoneNumber.get(phoneNumber);
    }

    public String findByName(String name) {
        return contacts.get(name);
    }
    
    

    public int getPhoneBookSize() {
        return contacts.size();
    }

    public boolean phoneBookIsEmpty() {
        return contacts.isEmpty();
    }

    public void printAllNames() {
    }
}