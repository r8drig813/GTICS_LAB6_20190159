package com.example.lab6_20190159.repository;

import com.example.lab6_20190159.entities.Technician;
import com.example.lab6_20190159.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician,Integer> {
}
