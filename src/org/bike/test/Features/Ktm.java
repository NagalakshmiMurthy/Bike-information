package org.bike.test.Features;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Bike cost is 100000");
	}

	@Override
	public void speed() {
		System.out.println("Bike speed is 80/hr");
		
	}
	
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
		
	}
	
	

}
