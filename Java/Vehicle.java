package Inclass;

enum Color{
	YELLLOW,GREEN,BLUE, RED;
}

public class Vehicle {
	
	protected String Plate_number;
	protected String state;
	int number_of_wheels;
	
	
	/********************************************
	 * Autogenerated using eclipse
	 */
	
	
	public Vehicle() {
		super();
	}


	public Vehicle(String plate_number, String state, int number_of_wheels) {
		super();
		Plate_number = plate_number;
		this.state = state;
		this.number_of_wheels = number_of_wheels;
	}

	/*******************************************************
	 * Auto-generated using Eclipse
	 * @return
	 */
	
	
	
	public String getPlate_number() {
		return Plate_number;
	}


	public void setPlate_number(String plate_number) {
		Plate_number = plate_number;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getNumber_of_wheels() {
		return number_of_wheels;
	}


	public void setNumber_of_wheels(int number_of_wheels) {
		this.number_of_wheels = number_of_wheels;
	}


	@Override
	public String toString() {
		return "Vehicle [Plate_number=" + Plate_number + ", state=" + state + ", number_of_wheels=" + number_of_wheels
				+ "]";
	}	
}


class SUV extends Vehicle{
	
	private int number_of_seats;
	
	
	/*********************************************
	 * Auto-generated with Eclipse the no-arg, and arg constructor
	 */

	public SUV() {
		super();
	}

	public SUV(String plate_number, String state, int number_of_wheels, int number_of_seats) {
		super(plate_number, state, number_of_wheels);
		this.number_of_seats = number_of_seats;
	}

	/************************************************
	 * Auto-generated setters and getters using Eclipse
	 * @return
	 */
	
	
	
	public int getNumber_of_seats() {
		return number_of_seats;
	}

	public void setNumber_of_seats(int number_of_seats) {
		this.number_of_seats = number_of_seats;
	}
	/*********************************************************************
	 * Auto-generated toString string using Eclipse
	 */
	
	
	@Override
	public String toString() {
		return "SUV [number_of_seats=" + number_of_seats + ", Plate_number=" + Plate_number + ", state=" + state
				+ ", number_of_wheels=" + number_of_wheels + "]";
	}	
}

class Bus extends Vehicle{
	
	private Color color;
	
	/****************************************
	 * Autogenerated using Eclispse constructors
	 */

	public Bus() {
		super();
	}

	public Bus(String plate_number, String state, int number_of_wheels, Color color) {
		super(plate_number, state, number_of_wheels);
		this.color = color;
	}

	/***************************************************
	 * Autogenerated getters and setters
	 * @return
	 */
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/*****************************************
	 * Autogenerated toString String
	 */
	
	@Override
	public String toString() {
		return "Bus [color=" + color + ", Plate_number=" + Plate_number + ", state=" + state + ", number_of_wheels="
				+ number_of_wheels + "]";
	}
	
	
	
	
	
	
}