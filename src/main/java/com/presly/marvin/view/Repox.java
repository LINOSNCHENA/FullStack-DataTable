package com.presly.marvin.view;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.presly.marvin.model.wEmployee;

@Repository
public interface Repox extends JpaRepository<wEmployee, Integer> {}