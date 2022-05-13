package Inclass;

import Inclass.Vehicle;

public class testvehicle {

	public static void main(String[] args) {
		
		Vehicle Honda = new Vehicle("PCG214","NJ",4);
		System.out.println(Honda.toString());
		Vehicle Tototya = new Vehicle();
		Tototya.setPlate_number("ZZZ101");
		Tototya.setState("PA");
		Tototya.setNumber_of_wheels(4);
		System.out.println(Tototya.toString());
		Vehicle GMC = new Vehicle();
		GMC.setPlate_number("XY21");
		GMC.setState("MI");
		GMC.setNumber_of_wheels(2);
		Bus NJTransit = new Bus("PCG215", "NJ", 5, Color.BLUE);
		System.out.println(NJTransit.toString());
		SUV Prius = new SUV("PCG216", "NY", 6, 6);
		System.out.println(Prius.toString());
	}
		
}
