package org.bike;

public class Ktm implements Bike {
	

	

	@Override
	public void cost() {
		System.out.println("hai");
		
	}

	@Override
	public void speed() {
		System.out.println("how are you");
		
	}
public static void main(String[] args) {
	Ktm k= new Ktm();
	k.cost();
	k.speed();
	
}
}
