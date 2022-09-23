 package com.cognizant.sportsEventMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.sportsEventMicroservice.entity.Event;
import com.cognizant.sportsEventMicroservice.entity.Sports;
import com.cognizant.sportsEventMicroservice.service.SportsEventService;


@RestController
public class SportsEventController {
	@Autowired
	private SportsEventService ses;

	@GetMapping("/sports")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public List<Sports> getAllSports() {
		return this.ses.getAllSports();
	}

	@GetMapping("/sports/{sportsName}")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public List<Sports> getSportsByName(@PathVariable String sportsName) {
		return this.ses.getSportsByName(sportsName);
	}

	@GetMapping("/events")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public List<Event> getAllEvents() {
		return this.ses.getAllEvents();
	}

	@PostMapping("/events")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public Event addEvent(@RequestBody Event event) {
		return this.ses.addEvent(event);
	}

	@GetMapping("/events/{eventName}")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public List<Event> getEventsByName(@PathVariable String eventName) {
		return this.ses.getEventsByName(eventName);
	}

	@DeleteMapping("/events/{eventId}")
	@CrossOrigin(origins = "http://localhost:4200")
	
	public void deleteEvent(@PathVariable String eventId) {
		this.ses.deleteEvent(Integer.parseInt(eventId));
	}

}
