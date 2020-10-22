package com.presly.marvin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.presly.marvin.model.Contact;

@Repository
public interface Repo extends JpaRepository<Contact, Long> {

// Use services instead of in-built functions

}