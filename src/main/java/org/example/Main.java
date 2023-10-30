package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Oleg",7654321);
        book.add("Artem",1234567);
        book.add("Ivan", 9876543);

        book.printAllNames();
    }
}