package org.veluka.Vapi.ddbb.services.dnd;

import java.util.List;

import org.veluka.Vapi.ddbb.entities.dnd.PjsGear;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


public class PjsGearService {
	
	@PersistenceContext(unitName = "DndUnit")
	private EntityManager em;
	
	public PjsGear findPjsGear(int id) {
		return em.find(PjsGear.class, id);
	}
	
	public List<PjsGear> allCharacters() {
	   return em.createQuery("SELECT c FROM pjs_gear c", PjsGear.class).getResultList();
	}
	
}
