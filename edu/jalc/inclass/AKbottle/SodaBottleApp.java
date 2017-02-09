package edu.jalc.inclass.AKbottle;

import edu.jalc.inclass.AKlid.SodaBottleLid;

public class SodaBottleApp {

	public static void main(String... args) throws Exception {
		SodaBottle sodaBottle = new SodaBottle(20, new SodaBottleLid(1, 2));
		System.out.println("Capacity: " + sodaBottle.getCapacity());
	}
}