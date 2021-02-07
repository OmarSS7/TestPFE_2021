package sii.maroc;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

	
	@Test
	public void testVehicleConstuctor() {
		Vehicle vehicle = new Vehicle("CAR:DIESEL:4");
		Assert.assertEquals("CAR",vehicle.getId());
		Assert.assertEquals(FuelType.DIESEL,vehicle.getFuelType());
		Assert.assertEquals(4,vehicle.getNumberofDoors());	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIllegalVehicleConstuctorArgument() {
		Vehicle vehicle = new Vehicle("FAILING:TEST");
	}
	
}
