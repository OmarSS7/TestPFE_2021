package sii.maroc;



public class Vehicle {
	
	private String id;
	private FuelType fuelType;
	private int numberofDoors;
	
	
	public Vehicle(String string) throws IllegalArgumentException {
		try {
			String[] parts = string.split(":");
			this.setId(parts[0]);
			this.setFuelType(FuelType.valueOf(parts[1].toUpperCase()));
			this.numberofDoors = Integer.parseInt(parts[2]);
		} catch (Exception e) {
			throw new IllegalArgumentException("Valid format: VEHICLE_ID:FUEL_TYPE:NUMEBR_OF_DOORS");
		}
		
	}

	public String move(String string, String string2, String string3, String string4) {
		ReportGenerator report = ReportGeneratorFactory.getReportGenerator(string,string2,string3,string4);
		return report.render();
	}

	public int getNumberofDoors() {
		return numberofDoors;
	}

	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	
	
	
	
	
	
}
