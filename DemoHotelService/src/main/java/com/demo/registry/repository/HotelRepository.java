package com.demo.registry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.registry.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer>{

}
