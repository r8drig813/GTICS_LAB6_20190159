package com.example.lab6_20190159.repository;

import com.example.lab6_20190159.entities.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site,Integer> {
}
