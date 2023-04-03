package org.veluka.Vapi.ddbb.entities.dnd;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="pjs_gear")
public class PjsGear {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pj")
	private int idPj;
	@Column(name="neck")
	private String neck;
	@Column(name="ring_1")
	private String ring1;
	@Column(name="ring_2")
	private String ring2;
	@Column(name="armor")
	private String armor;
	@Column(name="main_weapon")
	private String mainWeapon;
	@Column(name="secondary_weapon")
	private String secondaryWeapon;
	@Column(name="helmet")
	private String helmet;
	@Column(name="cape")
	private String cape;
	@Column(name="belt")
	private String belt;
	@Column(name="boots")
	private String boots;
	@Column(name="pet_gear")
	private String petGear;
	@Column(name="extra_gear")
	private String extraGear;
	
	public PjsGear() {
		
	}

	public int getIdPj() {
		return idPj;
	}

	public void setIdPj(int idPj) {
		this.idPj = idPj;
	}

	public String getNeck() {
		return neck;
	}

	public void setNeck(String neck) {
		this.neck = neck;
	}

	public String getRing1() {
		return ring1;
	}

	public void setRing1(String ring1) {
		this.ring1 = ring1;
	}

	public String getRing2() {
		return ring2;
	}

	public void setRing2(String ring2) {
		this.ring2 = ring2;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getMainWeapon() {
		return mainWeapon;
	}

	public void setMainWeapon(String mainWeapon) {
		this.mainWeapon = mainWeapon;
	}

	public String getSecondaryWeapon() {
		return secondaryWeapon;
	}

	public void setSecondaryWeapon(String secondaryWeapon) {
		this.secondaryWeapon = secondaryWeapon;
	}

	public String getHelmet() {
		return helmet;
	}

	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}

	public String getCape() {
		return cape;
	}

	public void setCape(String cape) {
		this.cape = cape;
	}

	public String getBelt() {
		return belt;
	}

	public void setBelt(String belt) {
		this.belt = belt;
	}

	public String getBoots() {
		return boots;
	}

	public void setBoots(String boots) {
		this.boots = boots;
	}

	public String getPetGear() {
		return petGear;
	}

	public void setPetGear(String petGear) {
		this.petGear = petGear;
	}

	public String getExtraGear() {
		return extraGear;
	}

	public void setExtraGear(String extraGear) {
		this.extraGear = extraGear;
	}
	
	
}
