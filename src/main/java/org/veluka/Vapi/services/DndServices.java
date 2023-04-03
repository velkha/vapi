package org.veluka.Vapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.veluka.Vapi.ddbb.GestorDatabase;
import org.veluka.Vapi.ddbb.services.dnd.MainController;
import org.veluka.Vapi.utilities.Utilities;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/dnd")
public class DndServices {
	@Autowired
	private MainController mainController;
	@Autowired
	private GestorDatabase gestorDatabase;
	@RequestMapping("/a")
	public String getAllItems(){
		//TODO: FUNCIONALIDAD DND
		return null;
	}
	
	@RequestMapping("/b")
	public String getAllCharactes(){
		//TODO: FUNCIONALIDAD DND
		return null;
	}
	@RequestMapping("/c")
	public String getItemWFilters(){
		//TODO: FUNCIONALIDAD DND
		return null;
	}
	@RequestMapping("/d")
	public String getItemById(){
		//TODO: FUNCIONALIDAD DND
		return null;
	}
	@RequestMapping("/getCharacter")
	public String getCharacterInfo(@RequestParam(name = "charId", defaultValue="1")int id){
		/*PjsGearService pgs = new PjsGearService();
		PjsGear pjsGear = pgs.findPjsGear(1);*/
		
		Utilities utils = new Utilities();
		//GestorDatabase gestorDatabase = new GestorDatabase();
		String rtrStr = utils.toJson(gestorDatabase.getAllPjsGear());
		rtrStr += utils.toJson(mainController.getAllUsers());
		mainController.addNewUser("test", "test@gmail.com");
		return rtrStr;
	}
	@PostMapping("/")
	public @ResponseBody HttpServletResponse setCharacterInfon(
			HttpServletRequest request, 
	        HttpServletResponse response){
		//TODO: FUNCIONALIDAD DND
		return null;
	}
	
}
