package org.example;

import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {

        PhoneBook book = new PhoneBook();
        int addedNumber = book.addNumber(1234567);
        Assert.assertEquals(1234567, addedNumber);
    }
}