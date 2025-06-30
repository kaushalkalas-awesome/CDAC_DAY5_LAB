package com.app.fruits;

public class Fruit{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String color, double weight, String name, boolean isFresh){
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isFresh=isFresh;
	}
	
	//@return the color
	public String getColor() {
		return color;
	}

	
	//@param color the color to set
	public void setColor(String color) {
		this.color = color;
	}

	
	//@return the weight
	public double getWeight() {
		return weight;
	}

	
	//@param weight the weight to set
	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	//@return the name
	public String getName() {
		return name;
	}

	
	//@param name the name to set
	public void setName(String name) {
		this.name = name;
	}

	
	//@return the isFresh
	public boolean isFresh() {
		return isFresh;
	}

	
	//@param isFresh the isFresh to set
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	public String taste() {
		return "no specific taste";
	}

	@Override
	public String toString() {
		return "Name: "+this.name+"\nColor: "+this.color+"\nWeight: "+this.weight;	
	}
	
	
}


