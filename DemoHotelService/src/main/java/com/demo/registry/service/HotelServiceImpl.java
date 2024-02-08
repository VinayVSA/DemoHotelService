package com.demo.registry.service;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.capgemini.user.service.UserService.exceptions.ResourceNotFoundException;
import com.demo.registry.entity.Hotel;
import com.demo.registry.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	  @Autowired
	  HotelRepository hotelRepo;
	  
		@Override
		public Hotel create(Hotel hotel) {
			
			
			return hotelRepo.save(hotel);
			
		}

		@Override
		public List<Hotel> getAllHotels() {
			
			List<Hotel> hotelList = hotelRepo.findAll();
			
			return hotelList;
		}

		@Override
		public Hotel getHotelById(int hotelId)  {
			
			return hotelRepo.findById(hotelId).get();
		}
	

}
