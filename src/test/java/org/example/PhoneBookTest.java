package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        org.example.PhoneBook book = new org.example.PhoneBook();
        int size = book.add("Ivan", 1234567);
        Assert.assertEquals(1, size);
    }
}