package org.veluka.Vapi.models;

import org.veluka.Vapi.utilities.Utilities;

public class CharInventory {
	private DndItem neck;
	private DndItem ring1;
	private DndItem ring2;
	private DndItem armor;
	private DndItem mainWeapon;
	private DndItem secondaryWeapon;
	private DndItem helmet;
	private DndItem cape;
	private DndItem boots;
	private DndItem petGear;
	private DndItem[] extraGear ;
	
	
	
	public CharInventory() {
		super();
		this.extraGear=new DndItem[6];
	}
	public DndItem getNeck() {
		return neck;
	}
	public void setNeck(DndItem neck) {
		this.neck = neck;
	}
	public DndItem getRing1() {
		return ring1;
	}
	public void setRing1(DndItem ring1) {
		this.ring1 = ring1;
	}
	public DndItem getRing2() {
		return ring2;
	}
	public void setRing2(DndItem ring2) {
		this.ring2 = ring2;
	}
	public DndItem getArmor() {
		return armor;
	}
	public void setArmor(DndItem armor) {
		this.armor = armor;
	}
	public DndItem getMainWeapon() {
		return mainWeapon;
	}
	public void setMainWeapon(DndItem mainWeapon) {
		this.mainWeapon = mainWeapon;
	}
	public DndItem getSecondaryWeapon() {
		return secondaryWeapon;
	}
	public void setSecondaryWeapon(DndItem secondaryWeapon) {
		this.secondaryWeapon = secondaryWeapon;
	}
	public DndItem getHelmet() {
		return helmet;
	}
	public void setHelmet(DndItem helmet) {
		this.helmet = helmet;
	}
	public DndItem getCape() {
		return cape;
	}
	public void setCape(DndItem cape) {
		this.cape = cape;
	}
	public DndItem getBoots() {
		return boots;
	}
	public void setBoots(DndItem boots) {
		this.boots = boots;
	}
	public DndItem getPetGear() {
		return petGear;
	}
	public void setPetGear(DndItem petGear) {
		this.petGear = petGear;
	}
	public DndItem[] getExtraGear() {
		return extraGear;
	}
	public void setExtraGear(DndItem[] extraGear) {
		this.extraGear = extraGear;
	}
	public void setExtraGearSlot(int slot, DndItem dndItem) {
		this.extraGear[slot]=dndItem;
	}
	public String toJson() {
		Utilities utils = new Utilities();
		return utils.toJson(this);
	}
	
}
