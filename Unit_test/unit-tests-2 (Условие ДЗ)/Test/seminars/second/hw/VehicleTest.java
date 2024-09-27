package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach

    void setUp() {
        car = new Car("Toyota", "Camry", 2020);
        motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
    }

    @Test
    void carIsInstanceOfVehicle() {
        // Car car = new Car("Toyota", "Camry", 2020);
        assertTrue(car instanceof Vehicle, "Car should be an instance of Vehicle");
    }

    @Test
    void carHasFourWheels() {
        // Car car = new Car("Toyota", "Camry", 2020);
        assertEquals(4, car.getNumWheels(), "Car should have 4 wheels");
    }

    @Test
    void motorcycleHasTwoWheels() {
        // Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
        assertEquals(2, motorcycle.getNumWheels(), "Motorcycle should have 2 wheels");
    }

    @Test
    void carTestDriveSetsSpeedTo60() {
        // Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Car speed should be 60 after test drive");
    }

    @Test
    void motorcycleTestDriveSetsSpeedTo75() {
        // Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle speed should be 75 after test drive");
    }

    @Test
    void carStopsWhenParked() {
        // Car car = new Car("Toyota", "Camry", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car should have speed 0 after parking");
    }

    @Test
    void motorcycleStopsWhenParked() {
        // Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle should have speed 0 after parking");
    }
}
