package com.demo.registry.service;

import java.util.List;

import com.demo.registry.entity.Hotel;



public interface HotelService {

	
    public Hotel create(Hotel hotel);
	
	
	
	public List<Hotel>getAllHotels();
	
	
	public Hotel getHotelById(int hotelId);

	
}
