package com.example.demo.repo;

import com.example.demo.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepo extends JpaRepository<Contact,Integer> {

}
