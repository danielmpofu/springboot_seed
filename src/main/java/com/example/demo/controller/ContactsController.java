package com.example.demo.controller;

import com.example.demo.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.Contact;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactsController {

//    ConcurrentHashMap<Integer, Contact> concurrentHashMap = new ConcurrentHashMap<>();

    @Autowired
    ContactServiceImpl contactService;

    @GetMapping("/{id}")
    public Contact getOneContact(@PathVariable int id) {
        return contactService.getContact(id);
    }

    @GetMapping("/")
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping("/")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

}
