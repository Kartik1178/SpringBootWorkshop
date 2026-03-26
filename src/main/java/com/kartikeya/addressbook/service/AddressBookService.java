package com.kartikeya.addressbook.service;

/*
 * In-memory storage
 */
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    private List<String> data = new ArrayList<>();

    // add
    public void add(String value) {
        data.add(value);
    }

    // get all
    public List<String> getAll() {
        return data;
    }
}
