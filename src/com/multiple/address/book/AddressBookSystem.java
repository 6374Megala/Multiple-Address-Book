package com.multiple.address.book;

import java.util.*;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooks = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void addAddressBook(String addressBookName) {
        if (addressBooks.containsKey(addressBookName)) {
            System.out.println("Address Book with the same name already exists.");
        } else {
            AddressBook newAddressBook = new AddressBook();
            addressBooks.put(addressBookName, newAddressBook);
            System.out.println("Address Book '" + addressBookName + "' added successfully.");
        }
    }

    public AddressBook getAddressBook(String addressBookName) {
        return addressBooks.get(addressBookName);
    }

    public void displayAddressBooks() {
        System.out.println("Address Books in the System:");
        for (String addressBookName : addressBooks.keySet()) {
            System.out.println("- " + addressBookName);
        }
    }
}
