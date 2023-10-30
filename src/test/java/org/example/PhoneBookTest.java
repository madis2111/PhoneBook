package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        int size = book.add("Ivan", 1234567);
        Assert.assertEquals(1, size);
    }
    @Test
    public void findByNumberTest() {
        PhoneBook book = new PhoneBook();
        book.add("Ivan", 1234567);
        String name = book.findByNumber(1234567);
        Assert.assertEquals("Ivan", name);
    }
}