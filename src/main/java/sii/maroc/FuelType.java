package sii.maroc;

public enum FuelType {
DIESEL(5),
FUEL(6),
HYBRID(3);
	
	private int consumption;
	
	private FuelType(int consumption) {
		this.consumption = consumption; 
	}
	
	public int getConsumption() {
		return this.consumption;
	}
	
}
