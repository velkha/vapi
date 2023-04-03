package org.veluka.Vapi.models;

import org.veluka.Vapi.utilities.Utilities;

public class Character {
	private int id;
	private String name;
	private String desc;
	private CharInventory charInventory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public CharInventory getCharInventory() {
		return charInventory;
	}
	public void setCharInventory(CharInventory charInventory) {
		this.charInventory = charInventory;
	}
	public String toJson() {
		Utilities utils = new Utilities();
		return utils.toJson(this);
	}
}
