package org.tanmay.learnjava;

public class Triangle {
	private String type;
	private String nSides;
	
	
	public String getType(){
		return type;
	}
	
	//Setter() is used by the Spring bean factory
	//if removed - will get error
	public void setType(String type){
		this.type = type;
	}
	
	public String getnSides() {
		return nSides;
	}

	public void setnSides(String nSides) {
		this.nSides = nSides;
	}
	
	public void draw(){
		System.out.println(this.getType() + " Triangle drawn");
		System.out.println("No of Side = " + getnSides());	
		
	}
}
