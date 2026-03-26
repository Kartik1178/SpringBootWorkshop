package com.kartikeya.addressbook.controller;

/*
 * UC1: Basic AddressBook Controller
 */
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // GET all
    @GetMapping
    public String getAll() {
        return "All contacts";
    }
}
