
public class SportCarBuilder implements CarBuilder {

	private final Car car = new Car("SPORT");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 150.5, " +
				"overall width (inches): 66.6, overall height (inches): 40.4, wheelbase (inches): 102.2," +
				" front track (inches): 55.5, rear track (inches): 44.4 and curb to curb turning circle (feet): 33.3");
	}
	
	@Override
	public void buildPower(){
		car.setPower("570 hp @ 13,000 rpm; 506 ft lb of torque @ 8,000 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("7.2L Duramax V 12 DOHC");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: four ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Front seat center armrest. No rear seats");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated side windows with defroster. No rear window ");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 19 MPG city, 29 MPG highway, 23 MPG combined and 300 mi. range");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
	
}
