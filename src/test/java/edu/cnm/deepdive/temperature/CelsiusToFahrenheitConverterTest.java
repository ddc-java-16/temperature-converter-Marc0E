package edu.cnm.deepdive.temperature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CelsiusToFahrenheitConverterTest {

  @Test
  void convert() {
    assertEquals(32, new CelsiusToFahrenheitConverter().convert(0),0.00001);

    assertEquals(212, new CelsiusToFahrenheitConverter().convert(100),0.00001);

    assertEquals(-40, new CelsiusToFahrenheitConverter().convert(-40),0.00001);
    /* double freezingCelsius = 0;
    double expectedFreezingFahrenheit = 32;
    double actualFreezingFahrenheit = new CelsiusToFahrenheitConverter().convert(freezingCelsius);
    assert expectedFreezingFahrenheit == actualFreezingFahrenheit; all these is the same as the line #11*/
  }
}