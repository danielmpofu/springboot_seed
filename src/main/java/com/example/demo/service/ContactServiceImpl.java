package com.example.demo.service;

import com.example.demo.entities.Contact;
import com.example.demo.repo.JPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContactServiceImpl implements ContactService {
    @Autowired
    JPARepo jpaRepo;

    @Override
    public Contact saveContact(Contact contact) {
        return jpaRepo.save(contact);
    }

    @Override
    public Contact getContact(int id) {
        return jpaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Contact> getAllContacts() {
        return jpaRepo.findAll();
    }

}
