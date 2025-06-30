package com.app.fruits;

public class Apple extends Fruit{
	
	public Apple(String color, double weight, String name, boolean isFresh){
		super(color,weight,name,isFresh);
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
	
}
