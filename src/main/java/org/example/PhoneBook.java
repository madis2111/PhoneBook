package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private Map<String, Integer> map;

    public PhoneBook() {
        map = new TreeMap<>();
    }

    public int add(String name, int number) {
        map.put(name, number);
            return map.size();
    }
}