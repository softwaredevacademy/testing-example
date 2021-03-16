package se.sdaproject.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {

    @Test
    public void validateColorShouldThrowIllegalArgumentExceptionWithInvalidColor() {
        String color = "wmfaopaefefea";
        assertThrows(
                IllegalArgumentException.class,
                () -> Validation.valdiateColor(color)
        );
    }

    @Test
    public void validateColorShouldNotThrowExceptionWithValidColor() {
        String color = "red";
        assertDoesNotThrow(
                () -> Validation.valdiateColor(color)
        );
    }

    @Test
    public void gasShouldIncreseSpeed() {
        Car car = new Car(20, "123ABC", "red", "Mazda");
        int force = 5;

        car.gas(force);

        assertEquals(5, car.getSpeed());

    }

    @Test
    public void gasShouldNotIncreseSpeedAboveTopSpeed() {
        Car car = new Car(10, "123ABC", "red", "Mazda");
        int force = 15;

        car.gas(force);

        assertEquals(10, car.getSpeed());

    }

}
