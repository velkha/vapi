package org.veluka.Vapi.models;

public class Supply {
	private int id;
	private String name;
	private String desc;
	private int idCampaing;
	
	
	public Supply(int id, String name, String descripcion, int idCampaing) {
		super();
		this.id = id;
		this.name = name;
		this.desc = descripcion;
		this.idCampaing = idCampaing;
	}
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
	public void setDesc(String descripcion) {
		this.desc = descripcion;
	}
	public int getIdCampaing() {
		return idCampaing;
	}
	public void setIdCampaing(int id_campaing) {
		this.idCampaing = id_campaing;
	}
	public String getDesc() {
		return desc;
	}
	
	
	
}
