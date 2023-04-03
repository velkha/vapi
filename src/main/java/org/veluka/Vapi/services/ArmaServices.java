package org.veluka.Vapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.veluka.Vapi.models.Supply;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/arma")
public class ArmaServices {
	
	@RequestMapping("/supplies")
	public List<Supply> getAllSupplies(@RequestParam(name = "missionid", defaultValue="1")int id){
		List<Supply> supplies = new ArrayList<Supply>();
		supplies.add(new Supply(0, "supply", "desc", id));
		supplies.add(new Supply(1, "supply1", "desc1", id));
		supplies.add(new Supply(2, "supply2", "desc2", id));
		supplies.add(new Supply(3, "supply3", "desc3", 2));
		supplies.add(new Supply(4, "supply4", "desc4", 2));
		supplies.add(new Supply(5, "supply5", "desc5", 2));
		return supplies;
	}
	
	@PostMapping("/makemission")
	public @ResponseBody HttpServletResponse createMission(
			HttpServletRequest request, 
	        HttpServletResponse response) {
		
		
		
		
		
		
		return null;
	}
} 
