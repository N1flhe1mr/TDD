package ru.netology;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, String> contacts = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        return contacts.size();
    }

    public String findByNumber(String phoneNumber) {
        return null;
    }

    public int getPhoneBookSize() {
        return contacts.size();
    }

    public boolean phoneBookIsEmpty() {
        return contacts.isEmpty();
    }


}
