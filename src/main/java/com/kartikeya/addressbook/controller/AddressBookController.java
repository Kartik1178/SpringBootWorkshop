package com.kartikeya.addressbook.controller;

/*
 * UC2: CRUD REST Controller
 */
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // GET
    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Get all contacts");
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable int id) {
        return ResponseEntity.ok("Get contact " + id);
    }

    // POST
    @PostMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.ok("Created");
    }

    // PUT
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id) {
        return ResponseEntity.ok("Updated " + id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok("Deleted " + id);
    }
}
